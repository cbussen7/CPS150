/*
Christopher Bussen
CPS 150 02
Assignment 4
SumofOddDigits: number ; number

program takes in a number from the user and calculates and prints the
sum of all of the number's odd digits

ex1: user inputs 32677 - program outputs 17
ex2: user inputs -11192 - program outputs 0 (program needs a positive integer)
ex3: user inputs 101.65 - program outputs error
ex4: user inputs x - program outputs error
ex5: user inputs 117 - program outputs 9
ex6: user inputs 2229 - program outputs 9
 */

import java.util.Scanner;

public class SumOfOddDigits {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a number and declare an int variable for it
        System.out.print("Enter a positive integer: ");
        int userNumber = input.nextInt();

        //declare an int variable for the last digit of the number
        int lastDigit = 0;

        //declare an int variable for the sum of the odd digits
        int sumOddDigits = 0;

        //use while loop to calculate sum of odd digits
        while(userNumber > 0){
            lastDigit = userNumber % 10;

            //add digit to sum if odd
            if(lastDigit % 2 != 0){
                sumOddDigits = sumOddDigits + lastDigit;
            }

            userNumber = userNumber / 10;
        }

        //print sum of odd digits
        System.out.println("The sum of all odd digits is " + sumOddDigits);
    }
}
