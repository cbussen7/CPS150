/*
Christopher Bussen
CPS 150 02
Assignment 2
CircleAndSphereCalculations: number; number number number number

program takes in a value for the radius from the user and calculates/
outputs the area and circumference of a circle with that radius as
well as the volume and surface area of a sphere with that radius

Circle area = pi * r^2
Circle circumference = 2 * pi * r
Sphere volume = (4/3) * pi * r^3
Sphere surface area = 4 * pi * r^2

ex1: user inputs 8 - program outputs 201.061, 50.265, 2144.660, 804.247
ex2: user inputs 6.2 - program outputs 120.762, 38.955, 998.305, 483.051
ex3: user inputs -12.5 - program outputs 490.873, -78.539, -8181.230, 1963.495
ex4: user inputs x - program outputs error
ex5: user inputs 2 - program outputs 12.566, 12.566, 35.510, 50.265
 */

import java.util.Scanner;
public class CircleAndSphereCalculations {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the radius and declare a double variable to store the radius
        System.out.print("Please enter the value of the radius: ");
        double radius = input.nextDouble();

        //declare a double variable for the area of the circle
        double circleArea = Math.PI * Math.pow(radius, 2);

        //declare a double variable for the circumference of the circle
        double circleCircumference = 2 * Math.PI * radius;

        //declare a double variable for the volume of the sphere
        double sphereVolume = (4.0/3) * Math.PI * Math.pow(radius, 3);

        //declare a double variable for the surface area of the sphere
        double sphereSurfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        //print all of the results
        System.out.println("The area of the circle is " + circleArea + ", the circumference of the circle is " + circleCircumference + "\nThe volume of the sphere is " + sphereVolume + ", and the surface area of the sphere is " + sphereSurfaceArea);
    }
}
