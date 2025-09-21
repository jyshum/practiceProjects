import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int userNum = in.nextInt();
        int numHundreds = userNum/100;
        int numTens = (userNum%100)/10;
        int numOnes = (userNum%100)%10;
        int sumOfDigits = numHundreds + numTens + numOnes;
        System.out.print("The sum of the digits of " + userNum + " is " + sumOfDigits);
    }
}
