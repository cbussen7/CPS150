/*
Christopher Bussen
CPS 150 02
Lab 4
MathFunctions: number number; number number number number

program takes in two numbers from user and calculates and outputs the sum,
difference, product, and quotient of the two numbers

ex1: user inputs 1, 2 - program outputs 3, 1, 2, 0
ex2: user inputs 3, -1 - program outputs -2, 4, -3, -3
ex3: user inputs 4.2, 9 - program outputs error
ex4: user inputs 128, x - program outputs error
ex5: user inputs -10, -5 - program outputs -15, -5, 50, 2
NOTE: if first number is smaller than second, quotient will be 0 since ints are being used
 */

import java.util.Scanner;
public class MathFunctions {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //declare two int variables to store the values of the user input
        int firstNumber;
        int secondNumber;

        //prompt user to enter values for variables and assign the inputs to their respective variables
        System.out.print("Enter an integer: ");
        firstNumber = input.nextInt();

        System.out.print("Enter another integer: ");
        secondNumber = input.nextInt();

        //declare output int variables for sum, difference, product, and quotient
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;

        //print the sum, difference, product, and quotient
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + quotient);
    }
}
