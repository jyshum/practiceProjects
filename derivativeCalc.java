import java.util.Scanner;

public class derivativeCalc {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        System.out.println("This program is to calculate the derivative of a function.\n" +
                "Unfortunately I'm not sophisticated enough to find derivatives of complicated functions\n" +
                ", so you can only give one value.");

        System.out.print("What is your coefficient? ");
        int coefficient = in.nextInt();
        in.nextLine();

        System.out.print("What is the variable letter? ");
        String letter = in.nextLine();

        System.out.print("What is the numerical power? ");
        int powerValue = in.nextInt();

        System.out.println("This is the function you created: f(" + letter + ") = " +
                coefficient + letter + "^" + powerValue);

        derivCalc(coefficient, letter, powerValue);
    }

    public static void derivCalc(int coefficientD, String letterD, int numericalPow) {
        System.out.print("f'(" + letterD + ") = " + coefficientD*numericalPow + letterD + "^" + (numericalPow-1));
    }
}
