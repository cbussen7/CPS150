/*
Christopher Bussen
CPS 150 02
Lab 8
IntegerDigits: number; number

program takes in an integer from the user and prints out the number
of digits in the given integer

ex1: user inputs 5 - program outputs 1
ex2: user inputs 5300009 - program outputs 7
ex3: user inputs -1067 - program outputs -4
ex4: user inputs x - program outputs error
ex5: user inputs 122.4 - program outputs error
 */

import java.util.Scanner;
public class IntegerDigits {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter an integer and declare int variable to store value
        System.out.print("Please enter an integer: ");
        int userNumber = input.nextInt();

        //declare variable to store number of digits
        int digits;

        //use if statements to see how many digits number has
        if(Math.abs(userNumber) > 999999999){
            digits = 10;
        }
        else if(Math.abs(userNumber) > 99999999){
            digits = 9;
        }
        else if(Math.abs(userNumber) > 9999999){
            digits = 8;
        }
        else if(Math.abs(userNumber) > 999999){
            digits = 7;
        }
        else if(Math.abs(userNumber) > 99999){
            digits = 6;
        }
        else if(Math.abs(userNumber) > 9999){
            digits = 5;
        }
        else if(Math.abs(userNumber) > 999){
            digits = 4;
        }
        else if(Math.abs(userNumber) > 99){
            digits = 3;
        }
        else if(Math.abs(userNumber) > 9){
            digits = 2;
        }
        else {
            digits = 1;
        }

        //use separate if statement to add negative before number of digits when necessary
        if(userNumber < 0){
            digits = digits * -1;
        }

        //print out the number of digits in the given integer
        System.out.println("The number " + userNumber + " has " + digits + " digits");
    }
}
