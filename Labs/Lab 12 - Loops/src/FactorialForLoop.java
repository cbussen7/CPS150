/*
Christopher Bussen
CPS 150 02
Lab 12
FactorialForLoop: number ; number

program takes in an n value and uses a for loop to calculate/print
the factorial of n (ex: n=3, 3!=3*2*1)

ex1: user inputs 4 - program outputs 24
ex2: user inputs 11 - program outputs 39916800
ex3: user inputs 101.65 - program outputs error
ex4: user inputs x - program outputs error
ex5: user inputs -5 - program outputs Please enter an integer greater than or equal to 0
ex6: user inputs 0 - program outputs 1
 */

import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter an n value and declare an int variable to store the value
        System.out.print("Please enter your n value: ");
        int n = input.nextInt();

        //initialize a variable for factorial
        int factorial = 1;

        //use if statement to check if n is greater than or equal to 0 and print error statement if it isn't
        if(n >= 0) {
            //use for loop to multiply by each number up to n
            for (int i = 1; i <= n; i++){
                factorial = factorial * i;
            }
        }
        else{
            System.out.println("Please enter an integer greater than or equal to 0");
        }

        //print the factorial of n
        System.out.println("The factorial is " + factorial);
    }
}
