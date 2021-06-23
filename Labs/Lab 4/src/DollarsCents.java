/*
Christopher Bussen
CPS 150 02
Lab 4
DollarsCents: number; number number

program takes in a total price from the user and separately outputs
the amount of dollars and the amount of cents

ex1: user inputs 2.39 - program outputs 2, 39
ex2: user inputs 8.00 - program outputs 8, 0
ex3: user inputs - 64.89 - program outputs 64, 89
ex4: user inputs x - program outputs error
ex5: user inputs -22.40 - program outputs -22, -39 - negatives will be one cent off because of the
+0.5 when creating cents variable
 */

import java.util.Scanner;
public class DollarsCents {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a price
        System.out.print("Enter a price: $");

        //declare a float variable to store the price the user inputs
        float price = input.nextFloat();

        //declare an int variable and assign the price to it (output)
        int dollars = (int) price;

        //declare an int variable for cents (output) - multiply price - dollars by 100, add 0.5, and assign this value to the variable
        int cents = (int) ((price - dollars) * 100 + 0.5);

        //print the amount of dollars
        System.out.println("There are " + dollars + " dollars");

        //print the amount of cents
        System.out.println("There are " + cents + " cents");
    }
}
