/*
Christopher Bussen
CPS 150 02
Assignment 3
AllDifferentDoubles: number number number; boolean

program takes in 3 doubles from the user and checks to see if
they are all different - returns true if they are, false if they
aren't

ex1: user inputs 12, 12, 12 - programs outputs false
ex2: user inputs 100.2, 100.2 100.2 - program outputs false
ex3: user inputs 9, 3, 7 - program outputs true
ex4: user inputs 11, -4, 11 - program outputs false
ex5: user inputs x, y, z - program outputs error
ex6: user inputs 32.4, 14, 8 - program outputs true

 */

import java.util.Scanner;

public class AllDifferentDoubles {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter 3 numbers and declare double variables for each
        System.out.print("Please enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        //call AllDifferent method to check if all numbers are different
        AllDifferent(num1, num2, num3);

    }

    //create method to check if all 3 numbers are different
    public static void AllDifferent(double x, double y, double z){
        //declare boolean variable for when all numbers are different
        boolean different;

        //use if statement to check if all numbers are different
        if(x != y && y !=z && x != z){
            different = true;
        }
        else{
            different = false;
        }

        //print the value of the boolean variable different
        System.out.println(different);
    }
}


