/*
Christopher Bussen
CPS 150 02
Assignment 3
SortedDoubles: number number number; boolean

program takes in 3 doubles from the user and checks to see if
they are sorted from smallest to largest - returns true if they
are, false if they aren't

ex1: user inputs 12, 12, 12 - programs outputs true
ex2: user inputs 100.2, 100.3 100.4 - program outputs true
ex3: user inputs 9, 3, 7 - program outputs false
ex4: user inputs 11, -4, -7 - program outputs false
ex5: user inputs x, y, z - program outputs error
ex6: user inputs 32.4, 39, 39 - program outputs true

 */

import java.util.Scanner;

public class SortedDoubles {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter 3 numbers and declare double variables for each
        System.out.print("Please enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        //call Sorted method to check if numbers are sorted from smallest to largest
        Sorted(num1, num2, num3);

    }

    //create method to check if 3 numbers are sorted from smallest to largest
    public static void Sorted(double x, double y, double z){
        //declare boolean variable for when all numbers are sorted from smallest to largest
        boolean smallestToLargest;

        //use if statement to check if all numbers are sorted from smallest to largest
        if(x <= y && y <= z){
            smallestToLargest = true;
        }
        else{
            smallestToLargest = false;
        }

        //print the value of the boolean variable smallestToLargest
        System.out.println(smallestToLargest);
    }
}


