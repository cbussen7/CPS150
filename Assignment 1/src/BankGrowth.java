/*
Christopher Bussen
CPS 150 02
Assignment 1
BankGrowth: number; number

program takes in a value from the user for their bank account balance, then
uses the annual interest rate to calculate and print the user's balance after
3 months

ex1: user inputs 100 - program outputs 102.5
ex2: user inputs 820.46 - program outputs 840.9715
ex3: user inputs 100456.98 - program outputs 102968.4045
ex4: user inputs x - program outputs error
ex5: user inputs -500.5 - program outputs -513.0125
 */

import java.util.Scanner;
public class BankGrowth {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to input a value for balance of their account
        System.out.print("Enter your current balance: $");

        //Declare a double variable to store the value of the user’s account
        double balance = input.nextDouble();

        //Declare a double variable for the annual interest rate (10%)
        double apr = 0.10;

        //Declare a double variable for the new balance of the account
        double newBalance = balance * (1 + (apr / 4.0));

        //Print out the new value of the user’s balance
        System.out.println("Your balance after 3 months will be: $" + newBalance);

    }
}
