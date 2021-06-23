/*
Christopher Bussen
CPS 150 02
Assignment 3
DaysInMonth: number; string

program takes in an integer corresponding to a month and determines/prints
how many days are in that given month

ex1: user inputs 1 - programs outputs There are 31 days in the given month
ex2: user inputs 2 - program outputs There are either 28 or 29 days in the given month
ex3: user inputs 9 - program outputs There are 30 days in the given month
ex4: user inputs 13 - program outputs Please enter an integer between 1 and 12
ex5: user inputs 1.6 - program outputs error
ex6: user inputs x - program outputs error

 */

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter a number for a given number and declare an int variable for the value
        System.out.print("Please enter month number (1 for January, 2 for February, etc.): ");
        int month = input.nextInt();

        //use if statements to see how many days will be in given month
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("There are 31 days in the given month");
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("There are 30 days in the given month");
        }
        else if(month == 2){
            System.out.println("There are either 28 or 29 days in the given month");
        }
        else{
            System.out.println("Please enter an integer between 1 and 12");
        }
    }
}
