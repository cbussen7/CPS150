/*
Christopher Bussen
CPS 150 02
Lab 5
FredsBank: number number; number

program takes in a the original balance in bank account and number of vacation months
and calculates total monthly fees and interest and adds at to balance to output a total
balance

ex1: user inputs 100, 4 - program outputs 80.370
ex2: user inputs 10645.2, 2 - program outputs 10656.496
ex3: user inputs - 100000, 2.6 - program outputs error
ex4: user inputs six - program outputs error
ex5: user inputs -1000.40, 1 - program outputs -1006.400
 */

import java.util.Scanner;
public class FredsBank {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to input a value for the current balance in the account
        System.out.print("Enter the current balance: $");

        //Declare an double variable to store the value of the user’s current balance
        double balance = input.nextDouble();

        //Prompt the user to input a value for the number of vacation months
        System.out.print("Enter the number of months on vacation: ");

        //Declare an int variable to store the value of vacation months the user enters
        int vacationMonths = input.nextInt();

        //Declare a double variable for the interest rate of the account
        double interestRate = 0.1;

        //Declare a double variable for the bank’s monthly maintenance fee
        double monthlyFee = 5.0;

        //Repeat process of gaining interest and paying fees for the amount of vacation months - use for loop
        //Declare int i to be the variable that controls the for loop
        int i = 0;

        for(i = 0; i < vacationMonths; i++) {
            //Declare a double variable for the amount of interest accrued each month
            double interest = balance * (interestRate / 100);

            //Reassign the variable for current balance the value of the old balance minus monthly fees plus interest
            balance = balance - monthlyFee + interest;
        }

        //Print out the final balance after the amount of vacation months
        System.out.println("Your balance after " + vacationMonths + " months will be: $" + balance);

    }
}
