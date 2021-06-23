/*
Christopher Bussen
CPS 150 02
Assignment 5
SmallestMethod: number number number ; number

program takes in 3 integers and determines/prints the smallest of the 3

ex1: user inputs 1, 2, 3 - program outputs 1
ex2: user inputs 88, 61, -900 - program outputs -900
ex3: user inputs 18, 19, 18- program outputs 18
ex4: user inputs x, y, z - program outputs error
ex5: user inputs 2.4, 3.1, 6 - program outputs error
 */

import java.util.Scanner;

public class SmallestMethod {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter 3 integers and declare int variables for each of them
        System.out.print("Enter 3 integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        //call the minimum method in a print statement using the 3 user numbers as inputs
        System.out.println("The minimum is " + findMinimum(num1, num2, num3));
    }

    //create separate method to determine the smallest of three numbers - takes in 3 ints and returns an int
    public static int findMinimum(int a, int b, int c){
        //declare an int variable for the minimum
        int minimum = 0;

        //use if statements to determine the minimum
        if(a <= b && a <= c){
            minimum = a;
        }
        else if(b <= a && b <= c){
            minimum = b;
        }
        else{
            minimum = c;
        }

        //return the minimum
        return minimum;

    }
}
