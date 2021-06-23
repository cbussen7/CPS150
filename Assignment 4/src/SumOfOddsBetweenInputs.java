/*
Christopher Bussen
CPS 150 02
Assignment 4
SumOfOddsBetweenInputs: number number ; number

program takes in two numbers from the user and calculates then prints
the sum of all odd numbers between the two inputs

ex1: user inputs 2, 10 - program outputs 24
ex2: user inputs -19, 11 - program outputs
ex3: user inputs 101.65, 103 - program outputs error
ex4: user inputs x, y - program outputs error
ex5: user inputs 112, 10 - program outputs 0
ex6: user inputs 77, 90 - program outputs 581
 */

import java.util.Scanner;

public class SumOfOddsBetweenInputs {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter two integers and declare int variables for them
        System.out.print("Please enter smaller integer: ");
        int a = input.nextInt();
        System.out.print("Please enter larger integer: ");
        int b = input.nextInt();

        //declare int variable for sum
        int sum = 0;

        //use while loop to add odds between a and b
        while(a <= b){
            //add to sum if odd
            if(a % 2 != 0){
                sum = sum + a;
            }
            a++;
        }

        //print the sum
        System.out.println("The sum of odd numbers is " + sum);
    }
}
