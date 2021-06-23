/*
Christopher Bussen
CPS 150 02
Lab 11
ReverseOf4Numbers: number ; number

program takes in an 4 digit integer value from the user and prints out
the value in the reverse order

ex1: user inputs 3167 - program outputs 7613
ex2: user inputs -1054 - program outputs -4501
ex3: user inputs 101.65 - program outputs error
ex4: user inputs x - program outputs error
ex5: user inputs 10189 - program outputs 9810 (will only print reverse of 4 numbers)
ex6: user inputs 78 - program outputs 8700 (4 iterations will happen - 0 will be printed for missing numbers)
 */

import java.util.Scanner;

public class ReverseOf4Numbers {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to input the number they want to be reversed and declare an int variable to store the value
        System.out.print("Enter the 4-digit integer you want reversed: ");
        int number = input.nextInt();

        //call ReverseIteration method
        ReverseIteration(number);
    }

    public static void ReverseIteration(int x){
        //declare int variables for the remainder and reverse number - will be used in iterations
        int remainder = 0;
        int reverseNumber = 0;

        //find remainder of dividing by 10
        //multiply the reverse number by 10 since were adding another digit then add the remainder
        //divide the number by 10 and use that as the new number
        //repeat process 3 more times
        remainder = x % 10;
        reverseNumber = reverseNumber * 10 + remainder;
        x = x / 10;

        remainder = x % 10;
        reverseNumber = reverseNumber * 10 + remainder;
        x = x / 10;

        remainder = x % 10;
        reverseNumber = reverseNumber * 10 + remainder;
        x = x / 10;

        remainder = x % 10;
        reverseNumber = reverseNumber * 10 + remainder;
        x = x / 10;

        //print the reversed number
        System.out.println("Your number reversed is " + reverseNumber);
    }
}
