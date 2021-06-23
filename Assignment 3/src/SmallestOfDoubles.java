/*
Christopher Bussen
CPS 150 02
Assignment 3
SmallestOfDoubles: number number number; number

program takes in 3 doubles from the user and determines/prints
which out which one is the smallest

ex1: user inputs 12, 12, 12 - programs outputs 12.0
ex2: user inputs 100.2, 100.3 100.4 - program outputs 100.2
ex3: user inputs 9, 3, 7 - program outputs 3.0
ex4: user inputs 11, -4, -7 - program outputs -7.0
ex5: user inputs x, y, z - program outputs error
ex6: user inputs 32.4, 32.4, 39 - program outputs 32.4

 */

import java.util.Scanner;

public class SmallestOfDoubles {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter 3 numbers and declare double variables for each
        System.out.print("Please enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        //call Smallest method to determine smallest number of the 3
        Smallest(num1, num2, num3);

    }

    //create method to find the smallest of 3 numbers
    public static void Smallest(double x, double y, double z){
        //declare variable for the smallest number
        double smallestNumber;

        //use if statements to determine which number is the smallest
        if(x <= y && x <= z){
            smallestNumber = x;
        }
        else if (y <= x && y <= z){
            smallestNumber = y;
        }
        else{
            smallestNumber = z;
        }

        //print the smallest number
        System.out.println("The smallest number is " + smallestNumber);
    }
}



