/*
Christopher Bussen
CPS 150 02
Assignment 5
HorsepowerToOvercomeDrag: number ; number

program takes in the velocity of the car from the user and calculates then prints
the power in watts and horsepower needed to overcome the resulting drag force

Drag force = (1/2)*(air density)*(velocity)^2*(area of car)*(drag coefficient)
Power in watts = (Drag force)*(velocity)
Horsepower = (Power) / 746

ex1: user inputs 20 - program outputs 2460.0, 3.297
ex2: user inputs 89 - program outputs 216777.9675, 290.587
ex3: user inputs 5 - program outputs 38.4375, 0.051
ex4: user inputs orange - program outputs error
ex5: user inputs 0 - program outputs 0.0, 0.0
 */

import java.util.Scanner;

public class HorsepowerToOvercomeDrag {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the velocity of the car and declare a double variable for it
        System.out.print("Enter the velocity of the car (m/s): ");
        double velocity = input.nextDouble();

        //declare a double variable for drag force by calling drag force method using user input velo
        double dragForce = computeDragForce(velocity);

        //declare a double variable for power and calculate power in watts needed
        double power = dragForce * velocity;

        //declare a double variable for the horsepower and calculate the horsepower needed
        double horsepower = power / 746;

        //print both power and horsepower needed
        System.out.println(power + " watts or " + horsepower + " hp are needed to overcome the drag force");

    }

    //create a separate method to calculate the drag force on the car - takes in a double for velocity and returns a double
    public static double computeDragForce(double carVelo){
        //declare a double variable for the value of air density
        double airDensity = 1.23;

        //declare a double variable for the value of the car's area
        double carArea = 2.5;

        //declare a double variable for the drag coefficient
        double dragCoefficient = 0.2;

        //declare a double variable for drag force and return this variable
        double drag = (1.0/2) * (airDensity) * (Math.pow(carVelo, 2)) * (carArea) * (dragCoefficient);

        return drag;
    }
}
