/*
Christopher Bussen
CPS 150 02
Utilizing math class
9/4/2020

ask the user to enter two numbers (double) to be used in Math class
 */
import java.util.Scanner;
public class DoMath {
    public static void main(String [] args){
        //Step 1: define the variables
        double firstNumber, secondNumber;

        //Step 2: Import scanner
        Scanner in = new Scanner(System.in);

        //Step 3: prompt the user to enter both numbers
        System.out.print("Enter the first number: ");
        firstNumber = in.nextDouble();

        System.out.print("Enter the second number: ");
        secondNumber = in.nextDouble();

        //Step 4: mathematic computations
        //print PI
        System.out.println("The value of pi is equal to: " + Math.PI);

        //find maximum
        System.out.println("The larger number is: " + Math.max(firstNumber, secondNumber));

        //calculate the first number to the power of the second number
        System.out.println(firstNumber + " to the " + secondNumber + " power is: " + Math.pow(firstNumber, secondNumber));

         
        //trig functions
        //sin of first number
        double angle = firstNumber * Math.PI / 180;
        System.out.println("The sine of the first number is: " + Math.sin(angle));
    }
}
