import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a weight (kg): ");
        double weight = in.nextDouble();
        System.out.print("Enter a height (m): ");
        double height = in.nextDouble();
        in.nextLine();

        double bmi = weight / Math.pow(height, 2);

        System.out.print("Do you think you're underweight, normal weight, or overweight? Answer with 1, 2, 3: ");
        String weightClass = in.nextLine();

        if (weightClass.equals("1")) {
            if (bmi < 18.5) {
                System.out.println("You said you are underweight. You are right!");
            } else {
                System.out.println("You said you are underweight. You are wrong... erm!");
            }
        } else if (weightClass.equals("2")) {
            if (bmi > 18.5 && bmi < 24.9) {
                System.out.println("You said you are normal weight. You are right!");
            } else {
                System.out.println("You said you are normal weight. You are wrong... erm!");
            }
        } else if (weightClass.equals("3")) {
            if (bmi > 24.9) {
                System.out.println("You said you are overweight. You are right!");
            } else {
                System.out.println("You said you are overweight. You are wrong... erm!");
            }
        } else if (weightClass != "1" && weightClass != "2" && weightClass != "3") {
            System.out.println("You didnt say 1, 2, or 3. 1 = underweight, 2 = normal weight, 3 = overweight\n" +
                    "Start the program over! You did it wrong vro.");
        }

        System.out.printf("BMI: %.1f\n", bmi);
    }
}
