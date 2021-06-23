import java.util.Scanner;

public class Problem4BankBalance {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter their initial deposit and declare a double variable to store the value
        System.out.print("Please enter your initial deposit: $");
        double initialDeposit = input.nextDouble();

        //prompt the user to enter their annual percentage rate and declare a double variable to store the value
        System.out.print("Please enter the annual percentage rate: ");
        double annualRate = input.nextDouble();

        //declare double variable for interest after year 1
        double interestAfterYear1 = initialDeposit * (annualRate / 100);

        //declare double variable for balance after year 1
        double balanceAfterYear1 = initialDeposit + interestAfterYear1;

        //declare double variable for interest after year 2
        double interestAfterYear2 = balanceAfterYear1 * (annualRate / 100);

        //declare double variable for balance after year 2
        double balanceAfterYear2 = balanceAfterYear1 + interestAfterYear2;

        //print balance after year 2
        System.out.println("The bank account's balance after year 2 will be: $" + balanceAfterYear2);
    }
}
