/*
Christopher Bussen
CPS 150 02
Long Week Project 5
Lab_Project_5: number number number number number (all put into double array) ; number number number number number

program takes in five total doubles for the balance of each of five individual customers
and then calculates and prints out 25% of each customer's original balance

Customer names given in problem: Cathy, Ben, Jorge, Wanda, Freddie

ex1: user inputs 100.00, 234.56, 2.49, 32.32, 400.00 - program outputs 25.0, 58.64, 0.6225, 8.08, 100.0
ex2: user inputs 0, 1.69, 22, 32.6, 12000 - program outputs 0.0, 0.4225, 5.5, 8.15, 3000.0
ex3: user inputs -15, -22, 5.67, -39, 47.223 - program outputs -3.75, -5.5, 1.4175, -9.75, 11.80575
ex5: user inputs x, y, c, dog, television - program outputs error
 */

import java.util.Scanner;

public class Lab_Project_5 {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //declare a string array variable with the 5 given names from the problem
        String[] customerName = {"Cathy", "Ben", "Jorge", "Wanda", "Freddie"};

        //use a for loop to print the array of customer names - could also use Arrays.toString or an enhanced for loop
        for(int i = 0; i < customerName.length; i++){
            System.out.print(customerName[i] + " ");
        }

        //print a new line after the customer names
        System.out.println();

        //declare a double array variable of length 5 to store the balance for each customer
        double[] customerBalance = new double[5];

        //use a for loop to prompt the user to enter balances for each name and add the balance to the customer balance array
        for(int j = 0; j < customerBalance.length; j++){
            System.out.print("Please enter " + customerName[j] + "'s balance: ");
            customerBalance[j] = input.nextDouble();
        }

        //use a for loop to print each customer and their balance
        for(int k = 0; k < customerName.length; k++){
            System.out.println(customerName[k] + "'s balance: " + customerBalance[k]);
        }

        //declare a double variable for the percent of each balance that will be calculated
        double multiplier = 0.25;

        //use a for loop to print each customer and 25% of their balance
        for(int x = 0; x < customerName.length; x++){
            //declare a double variable for 25% of the balance
            double percentOfBalance = customerBalance[x] * multiplier;
            System.out.println(customerName[x] + "'s new balance: " + percentOfBalance);
        }
    }
}
