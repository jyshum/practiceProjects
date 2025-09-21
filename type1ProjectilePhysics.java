import java.util.Scanner;

public class type1ProjectilePhysics {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the initial velocity? ");
        double initialV = in.nextDouble();
        System.out.print("What is the launch angle? ");
        double launchAngle = in.nextDouble();

        double horizV = initialV * Math.cos(Math.toRadians(launchAngle));
        double initialVertV = initialV * Math.sin(Math.toRadians(launchAngle));
        double finalvertV = initialVertV * -1;
        final double ACCEL_DUE_TO_GRAVITY = -9.81;
        double totalTime = (finalvertV - initialVertV) / ACCEL_DUE_TO_GRAVITY;
        double horizDistance = horizV * totalTime;
        double timeMidWay = totalTime / 2;
        double maximumHeight = (initialVertV*timeMidWay) + (1.0/2.0)*(ACCEL_DUE_TO_GRAVITY)* Math.pow(timeMidWay, 2);

        System.out.printf("Horizontal Velocity: = %.2f m/s\n", horizV);
        System.out.printf("Initial Vertical Velocity: = %.2f m/s\n", initialVertV);
        System.out.printf("Total Time of Flight: = %.2f s\n", totalTime);
        System.out.printf("Total horizontal distance travelled: = %.2f m\n", horizDistance);
        System.out.printf("Maximum Height reached: = %.2f m\n", maximumHeight);
    }
}
