/*
Christopher Bussen
CPS 150 02
Lab 4
TempConverter: number; number

program takes in the temperature in degrees Celsius from the user and
calculates and outputs the temperature in degrees Fahrenheit

Fahrenheit = (9/5)(Celsius)+32
ex1: user inputs 0 - program outputs 32
ex2: user inputs 8.2 - program outputs 46.76
ex3: user inputs -12 - program outputs 10.4
ex4: user inputs x - program outputs error
ex5: user inputs -22 - program outputs -7.6
 */
import java.util.Scanner;
public class TempConverter {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to input a value for the temperature in degrees Celsius
        System.out.print("Enter the temperature (in degrees Celsius): ");

        //declare double variable to store the degrees Celsius input by user
        double celsius = input.nextDouble();

        //declare double variable for Fahrenheit that calculates temperature using the equation
        double fahrenheit = (9 * celsius) / 5 + 32;

        //print the new converted temperature in degrees Fahrenheit
        System.out.println("The temperature is " + fahrenheit + " degrees Fahrenheit");

    }
}
