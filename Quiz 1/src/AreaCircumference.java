/*
Christopher Bussen
CPS 150 02
Quiz 1
AreaCircumference: number; number number

program takes in the radius of a circle from the user and calculates
and outputs both the area and circumference (perimeter)

Area of circle = π(radius)^2
Circumference of circle = 2π(radius)

ex1: user inputs 4 - program outputs 50.265, 25.132
ex2: user inputs 8.64 - program outputs 234.518, 54.286
ex3: user inputs 64.9 - program outputs 13232.419, 407.778
ex4: user inputs three - program outputs error
ex5: user inputs -10.40 - program outputs 339.794, -65.345
 */

import java.util.Scanner;
public class AreaCircumference {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to input a value for the radius of the circle
        System.out.print("Enter the radius of the circle: ");

        //Declare a double variable to store the value of the radius that the user enters
        double radius = input.nextDouble();

        // Declare a double variable to store the value of the area of the circle
        //Assign the area variable the value of π(radius)^2
        double area = Math.PI * Math.pow(radius, 2);

        //Print the area of the circle
        System.out.println("The area of the circle is: " + area);

        //Declare a double variable to store the value of the circumference (perimeter) of the circle
        //Assign the circumference variable the value of 2π(radius)
        double circumference = 2 * Math.PI * radius;

        //Print the circumference (perimeter) of the circle
        System.out.println("The circumference of the circle is: " + circumference);

    }

}
