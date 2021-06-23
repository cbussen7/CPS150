/*
Christopher Bussen
CPS 150 02
Assignment 3
AllTheSameDoubles: number number number; boolean

program takes in 3 doubles from the user and checks to see if
they are all equal - returns true if they are, false if they
aren't

ex1: user inputs 12, 12, 12 - programs outputs true
ex2: user inputs 100.2, 100.2 100.2 - program outputs true
ex3: user inputs 9, 3, 7 - program outputs false
ex4: user inputs 11, -4, 11 - program outputs false
ex5: user inputs x, y, z - program outputs error

 */

import java.util.Scanner;

public class AllTheSameDoubles {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter 3 numbers and declare double variables for each
        System.out.print("Please enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        //call AllTheSame method to check if all numbers are the same
        AllTheSame(num1, num2, num3);

    }

    //create method to check if all 3 numbers are the same
    public static void AllTheSame(double x, double y, double z){
        //declare boolean variable for when all numbers are the same
        boolean same;

        //use if statement to check if all numbers are the same
        if(x == y && y ==z){
            same = true;
        }
        else{
            same = false;
        }

        //print the value of the boolean variable same
        System.out.println(same);
    }
}
