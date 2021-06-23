/*
Christopher Bussen
CPS 150 02
Quiz 1
RAndNEquation: number number; number

program takes in values for variables r and n then calculates and
prints a new value using the following equation: y=(1 + (r/100))^n

ex1: user inputs 4, 5 - program outputs 1.216
ex2: user inputs 8.64, 17.1 - program outputs 4.125
ex3: user inputs 64.9, -5 - program outputs 0.082
ex4: user inputs three, x - program outputs error
ex5: user inputs -10.40, -2.22 - program outputs 1.276
 */

import java.util.Scanner;
public class RAndNEquation {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a value for r
        System.out.print("Enter the r value: ");

        //Declare an input double variable to store the value of r
        double r = input.nextDouble();

        //Prompt the user to enter a value for n
        System.out.print("Enter the n value: ");

        //Declare an input double variable to store the value of n
        double n = input.nextDouble();

        //Declare a double variable to store the result of the equation y=(1 + (r/100))^n
        double y = Math.pow((1 + (r/100)), n);

        //Print the result of the equation
        System.out.println("Your answer is y = " + y);
    }
}
