/*
Christopher Bussen
CPS 150 02
Assignment 2
RectangleCalculations: number number; number number number

program takes in the length and width of a rectangle from the
user and calculates/outputs the area, perimeter, and length of
the diagonal of the rectangle

Rectangle area = length * width
Perimeter = 2*length + 2*width
Length of diagonal = sqrt (length^2 + width^2)

ex1: user inputs 3, 4 - program outputs 12.0, 14.0, 5.0
ex2: user inputs 6.4, 1.9 - program outputs 12.16, 16.6, 6.676
ex3: user inputs -12, 3.21 - program outputs -38.519, -17.58, 12.421
ex4: user inputs x, bear - program outputs error
ex5: user inputs 0.5, 0.5 - program outputs 0.25, 2.0, 0.707
 */

import java.util.Scanner;
public class RectangleCalculations {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner (System.in);

        //prompt user to enter the length of the rectangle and create a variable to store the value
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        //prompt user to enter the width of the rectangle and create a variable to store the value
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        //declare a double variable for the area of the rectangle
        double area = length * width;

        //declare a double variable for the perimeter of the rectangle
        double perimeter = 2 * length + 2 * width;

        //declare a double variable for the length of the diagonal
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        //print results
        System.out.println("The area of the rectangle is " + area + ", the perimeter of is " + perimeter + ", and the length of the diagonal is " + diagonal);
    }
}
