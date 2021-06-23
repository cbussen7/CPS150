/*
Christopher Bussen
CPS 150 02
Assignment 2
GasEfficiency: number number number; number number

cost per 100 miles = (price per gallon / fuel efficiency) * 100
how far the car can get = gallons in tank * efficiency

program takes in the number of gallons in the gas tank, fuel efficiency (miles/gallon),
and price of gas per gallon ($), and calculates/outputs the cost per 100 miles and how
far the car can get

ex1: user inputs 5, 25, 2 - program outputs 8, 125.0
ex2: user inputs 9.5, 30, 2.5 - program outputs 8.333, 285.0
ex3: user inputs 0, 19, 2.21 - program outputs 11.631, 0.0
ex4: user inputs car, yard, boat - program outputs error
ex5: user inputs 11.5, 23.4, -3 - program outputs -12.820, 269.099
 */

import java.util.Scanner;
public class GasEfficiency {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter the number of gallons in the gas tank and declare a double variable to store the value
        System.out.print("Enter the number of gallons in the gas tank: ");
        double gallonsInTank = input.nextDouble();

        //prompt user to enter the fuel efficiency and declare a double variable to store the value
        System.out.print("Enter the fuel efficiency (in miles/gallon): ");
        double fuelEfficiency = input.nextDouble();

        //prompt user to enter the price per gallon and declare a double variable to store the value
        System.out.print("Enter the price of gas per gallon ($): ");
        double pricePerGallon = input.nextDouble();

        //declare a double variable for the cost per 100 miles
        double cost100Miles = (pricePerGallon / fuelEfficiency) * 100;

        //declare a double variable for how far the car can get with the current tank
        double currentDistance = gallonsInTank * fuelEfficiency;

        //print results
        System.out.println("The cost per 100 miles is " + cost100Miles + ", and the car can go " + currentDistance + " miles with the current tank");
    }
}
