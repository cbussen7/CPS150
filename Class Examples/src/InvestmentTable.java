import java.util.Scanner;

//This program should print a table showing the growth of an investment over several years

public class InvestmentTable {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //declare constant variables for rate of growth and initial balance
        final double RATE = 5;
        final double INITIAL_BALANCE = 10000;

        //declare double variable for balance
        double balance = INITIAL_BALANCE;

        //prompt user to enter the number of years for the investment and declare a variable to store value of years
        System.out.print("Enter number of years: ");
        int nYears = input.nextInt();

        //use for loop to print the balance for each year
        for(int year = 1; year <= nYears; year++){
            //declare a variable for the amount of interest each year
            double interest = balance * RATE / 100;

            //update balance - should be current balance plus interest
            balance = balance + interest;

            //print the year and its corresponding balance
            System.out.printf("%4d %10.2f\n", year, balance);
        }

    }
}
