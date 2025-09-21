import java.util.Scanner;

public class budgetingAssistance {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your monthly income: ");
        int monthlyIncome = in.nextInt();
        System.out.print("Enter your savings goal: ");
        int savingsGoal = in.nextInt();
        System.out.print("How many expenses? ");
        int numOfExpense = in.nextInt();

        double totalExpense = 0;
        for (int i = 1; i <= numOfExpense; i++) {
            System.out.print("Enter expense " + i + ": ");
            double expense = in.nextDouble();
            totalExpense += expense;
        }

        System.out.printf("Total expenses = %.2f\n", totalExpense);

        double remainingBalance = monthlyIncome - totalExpense;
        System.out.printf("Remaining balance = %.2f\n", remainingBalance);

        if (remainingBalance < savingsGoal) {
            System.out.print("You did not meet your savings goal. Bruh your mom is gonna get mad at you.\n");
        } else {
            System.out.print("You did meet your savings goal! Good job! You're financially literate!\n");
        }
    }
}
