/*
Christopher Bussen
CPS 150 02
Assignment 2
IntMathFunctions: number number; number number number number number number number

program takes in two integers from the user and calculates/outputs
the sum, difference, product, average, distance, maximum, and
minimum of the two integers

ex1: user inputs 3, 8 - program outputs 11, -5, 24, 5.5, 5, 8, 3
ex2: user inputs 0, 7 - program outputs 7, -7, 0, 3.5, 7, 7, 0
ex3: user inputs -2.5, 5 - program outputs error
ex4: user inputs x, y - program outputs error
ex5: user inputs 7, -5 - program outputs 2, 12, -35, 1.0, 12, 7, -5
 */

import java.util.Scanner;
public class IntMathFunctions {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the first integer and declare an int variable to store the value
        System.out.print("Please enter the first integer: ");
        int firstNum = input.nextInt();

        //prompt the user to enter the second integer and declare an int variable to store the value
        System.out.print("Please enter the second integer: ");
        int secondNum = input.nextInt();

        //declare a variable to store the sum of the integers
        int sum = firstNum + secondNum;

        //declare an int variable to store the difference of the integers
        int difference = firstNum - secondNum;

        //declare an int variable to store the product of the integers
        int product = firstNum * secondNum;

        //declare a double variable to store the average of the integers
        double average = sum / 2.0;

        //declare an int variable to store the value of the distance
        int distance = Math.abs(difference);

        //declare an int variable to store the value of the maximum
        int maximum = Math.max(firstNum, secondNum);

        //declare an int variable to store the value of the minimum
        int minimum = Math.min(firstNum, secondNum);

        //print all of the results
        System.out.println("The sum is " + sum + ", the difference is " + difference + ", the product is " + product + ", the average is " + average + ", the distance is " + distance + ", the maximum is " + maximum + ", and the minimum is " + minimum);
    }
}
