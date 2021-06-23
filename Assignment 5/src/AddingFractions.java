/*
Christopher Bussen
CPS 150 02
Assignment 5
AddingFractions: number number number number ; number number

program takes in a numerator and denominator for two fractions and calculates
and prints out the simplified sum of the two fractions

ex1: user inputs 3, 4, 5, 6 - program outputs 19/12
ex2: user inputs 1, 2, 1, 2 - program outputs 1/1
ex3: user inputs 7, 99, -1, 4 - program outputs -71/396
ex4: user inputs x, y, z, f - program outputs error
ex5: user inputs 10, 31, 9, 0 - program outputs error
 */

import java.util.Scanner;

public class AddingFractions {
    public static void main(String [] args){
        //import the scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the numerator and denominator for the first fraction and declare int variables for them
        System.out.print("Enter the numerator of the first fraction: ");
        int firstNumerator = input.nextInt();
        System.out.print("Enter the denominator of the first fraction: ");
        int firstDenominator = input.nextInt();

        //prompt the user to enter the numerator and denominator for the second fraction and declare int variables for them
        System.out.print("Enter the numerator of the second fraction: ");
        int secondNumerator = input.nextInt();
        System.out.print("Enter the denominator of the second fraction: ");
        int secondDenominator = input.nextInt();

        //call method that adds fractions using two numerators and denominators as inputs and print results
        System.out.print(firstNumerator + "/" + firstDenominator + " + " + secondNumerator + "/" + secondDenominator + " = ");
        System.out.println(addFractions(firstNumerator, firstDenominator, secondNumerator, secondDenominator));
    }

    //create a separate method that finds the greatest common divisor of two numbers - takes 2 ints as input and returns an int
    public static int greatestCommonDivisor(int a, int b){
        //return a when it is 0
        if(a == 0){
            return b;
        }
        //call recursive method
        return greatestCommonDivisor(b%a, a);
    }

    //create a separate method to simplify the added fractions
    public static String simplifyFractions(int x, int y){
        //find the greatest common divisor of the two ints
        int commonDenom = greatestCommonDivisor(x, y);

        //divide fractions by their common denominator
        x = x / commonDenom;
        y = y / commonDenom;

        //print the simplified fraction
        return (x + "/" + y);
    }

    //create a separate method to add the fractions
    public static String addFractions(int numerator1, int denominator1, int numerator2, int denominator2){
        //find the denominator by calling the greatest common divisor method for the two denominators
        int finalDenom = greatestCommonDivisor(denominator1, denominator2);

        //find least common multiple of two denominators
        finalDenom = (denominator1 * denominator2) / finalDenom;

        //add the numerators of the two fractions
        int finalNumerator = numerator1 * (finalDenom / denominator1) + numerator2 * (finalDenom / denominator2);

        //call method that simplifies the fraction using the final numerator and final denominator
        return simplifyFractions(finalNumerator, finalDenom);
    }
}
