
import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principalAmount;
        double annualInterestRate;
        double timeInYears;
        double totalInterest;
        double finalBalance;

        System.out.println("--- Simple Interest Calculator ---");
        
        System.out.print("Enter the initial principal amount: ");
        principalAmount = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        annualInterestRate = input.nextDouble();

        System.out.print("Enter the time period in years: ");
        timeInYears = input.nextDouble();

        totalInterest = (principalAmount * annualInterestRate * timeInYears) / 100;
        finalBalance = principalAmount + totalInterest;

        System.out.println("\n--- Results ---");
        System.out.println("Interest Earned: " + totalInterest);
        System.out.println("Total Balance: " + finalBalance);

        input.close();
    }
}