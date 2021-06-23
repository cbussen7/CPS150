/*
Christopher Bussen
CPS 150 02
Lab 12
FibonacciWhileLoop: number ; number

program takes in an n value where the Fibonacci Series will end
and calculates/prints out the sum of the series using a while loop

ex1: user inputs 9 - program outputs 0 1 1 2 3 5 8 13 21
ex2: user inputs -4 - program outputs nothing
ex3: user inputs 101.65 - program outputs error
ex4: user inputs x - program outputs error
ex5: user inputs 4 - program outputs 0 1 1 3
ex6: user inputs 2 - program outputs 0 1
 */

import java.util.Scanner;

public class FibonacciWhileLoop {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter end n value and declare an int variable for this value
        System.out.print("Please enter the n value: ");
        int endN = input.nextInt();

        //declare int variables for the n-2 term and the n-1 term
        int twoTermsAgo = 0;
        int oneTermAgo = 1;

        //declare an int variable for the counter n
        int n = 1;

        while(n <= endN){
            //print the n-2 term
            System.out.print(twoTermsAgo + " ");

            //declare an int variable for the sum and print the sum
            int sum = twoTermsAgo + oneTermAgo;

            //reassign n-2 term to the n-1 term and the n-1 term to sum
            twoTermsAgo = oneTermAgo;
            oneTermAgo = sum;

            //increment n
            n++;
        }
    }
}

