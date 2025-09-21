import java.util.Scanner;

public class TipTaxCalc {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a meal cost: ");
        double mealCost = in.nextDouble();
        double taxRate = 0.05;
        double tipRate = 0.15;
        double tax = mealCost * taxRate;
        double tip = mealCost * tipRate;
        double totalMealCost = mealCost + tax + tip;

        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + totalMealCost);

        System.out.print("How many people ate? ");
        int peopleNum = in.nextInt();
        double eachPersonPaid = totalMealCost / peopleNum;
        System.out.print("Each person pays: " + eachPersonPaid);


    }
}
