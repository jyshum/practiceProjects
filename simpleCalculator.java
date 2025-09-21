import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        Integer firstNum = in.nextInt();
        System.out.print("Enter second integer: ");
        Integer secondNum = in.nextInt();

        int addition = firstNum + secondNum;
        int subtraction = firstNum - secondNum;
        int multiplication = firstNum * secondNum;
        double division = (double)firstNum / (double)secondNum;
        int orderOfOperation = ((firstNum + secondNum * 2)) / 3;

    }
}
