/*
Christopher Bussen
CPS 150 02
Assignment 5
LargestMethod: number number number ; number

program takes in 3 integers and determines/prints the largest of the 3

ex1: user inputs 1, 2, 3 - program outputs 3
ex2: user inputs 88, 61, -900 - program outputs 88
ex3: user inputs 18, 19, 19- program outputs 19
ex4: user inputs x, y, z - program outputs error
ex5: user inputs 2.4, 3.1, 6 - program outputs error
 */

import java.util.Scanner;

public class LargestMethod {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter 3 integers and declare int variables for each of them
        System.out.print("Enter 3 integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        //call the maximum method in a print statement using the 3 user numbers as inputs
        System.out.println("The maximum is " + findMaximum(num1, num2, num3));
    }

    //create separate method to determine the largest of three numbers - takes in 3 ints and returns an int
    public static int findMaximum(int a, int b, int c){
        //declare an int variable for the maximum
        int maximum = 0;

        //use if statements to determine the maximum
        if(a >= b && a >= c){
            maximum = a;
        }
        else if(b >= a && b >= c){
            maximum = b;
        }
        else{
            maximum = c;
        }

        //return the maximum
        return maximum;

    }
}
