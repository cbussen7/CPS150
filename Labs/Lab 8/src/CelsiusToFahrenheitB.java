/*
Christopher Bussen
CPS 150 02
Lab 8
CelsiusToFahrenheitB: number; number, string

program takes in the temperature in degrees Celsius from the user and
calculates and outputs the temperature in degrees Fahrenheit as well as
giving suggestions for clothes to pack based on the temperature

Fahrenheit = (9/5)(Celsius)+32
ex1: user inputs 0 - program outputs 32
ex2: user inputs 8.2 - program outputs 46.76
ex3: user inputs -12 - program outputs 10.4
ex4: user inputs x - program outputs error
ex5: user inputs -22 - program outputs -7.6
 */
import java.util.Scanner;
public class CelsiusToFahrenheitB {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to input a value for the temperature in degrees Celsius
        System.out.print("Enter the temperature (in degrees Celsius): ");

        //declare double variable to store the degrees Celsius input by user
        double celsius = input.nextDouble();

        //call converter method and use user input
        converter(celsius);

    } //end main method

    //create separate method that takes in a double for converting temperature to Fahrenheit
    public static void converter(double x){
        //declare double variable for Fahrenheit that calculates temperature using the correct equation
        double fahrenheit = (9 * x) / 5 + 32;

        //print the new converted temperature in degrees Fahrenheit
        System.out.println("The temperature is " + fahrenheit + " degrees Fahrenheit");

        //tell user what type of clothes should be packed based on temperature
        if(x >= 20) {
            System.out.println("Pack short clothes for warm weather.");
        }
        else if(x >= 10) {
            System.out.println("Pack long pants and a long shirt for moderate weather.");
        }
        else if (x >= 0) {
            System.out.println("Pack warm clothes, a jacket, gloves, and a hat for chilly weather.");
        }
        else if(x >= -10) {
            System.out.println("Pack warm clothes, a coat, gloves, a hat, and boots for cold weather.");
        }
        else {
            System.out.println("Pack several warm layers, a coat, gloves, a hat, boots, and more for very cold weather.");
        }
        } //end converter method
    } //end program

