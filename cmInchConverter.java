import java.util.Scanner;

public class cmInchConverter {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        // user CM input
        System.out.print("Enter length in cm: ");
        Integer cmInput = in.nextInt();

        // unit conversion
        final double CM_PER_INCH = 2.54;

        // converting CM input into inches as the output
        double cmOutput = (double)cmInput * CM_PER_INCH;
        System.out.println((double)cmInput + " cm = " + cmOutput + " in");

        // converting to feet + inches using modulus
        int inchPerFeet = 12;
        int feetConversion = (int)cmOutput / inchPerFeet;
        int inchesRemainding = (int)cmOutput % inchPerFeet;

        // final output
        System.out.print("That is " + feetConversion + " ft " + inchesRemainding + " in");
        System.out.print(" or " + feetConversion + "'" + inchesRemainding);

    }
}
