import java.util.Scanner;

public class Problem10CompoundInterest {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter their initial balance and declare a double variable for it
        System.out.print("Please enter your initial balance: $");
        double userInitialBalance = input.nextDouble();

        //prompt the user to enter their interest rate and declare a double variable for it
        System.out.print("Please enter your interest rate: ");
        double userInterestRate = input.nextDouble();

        //prompt the user to enter the amount of years and declare an int variable for it
        System.out.print("Please enter the amount of years: ");
        int userYears = input.nextInt();

        //print user's balance
        System.out.println("Your balance is: $" + balance(userInitialBalance, userInterestRate, userYears));
    }

    public static double balance(double initialBalance, double interestRate, int years){
        interestRate = 1 + (interestRate / 100);
        return initialBalance * Math.pow(interestRate, years);
    }
}
