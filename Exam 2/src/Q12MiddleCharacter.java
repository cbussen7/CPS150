/*
Christopher Bussen
CPS 150 02
Exam 2
Q10Sum3Values: string ; character

program takes in a string from the user and determines/prints out
the character in the middle - position of middle character is the
length of the string divided by 2

ex1: user inputs abcde - program outputs c
ex2: user inputs abcdef - program outputs d
ex3: user inputs 10127.2 - program outputs 2
ex4: user inputs xyz - program outputs y
ex5: user inputs ab - program outputs Please enter a string of at least 3 characters*
ex6: user inputs 78, 78, 78 - program outputs 8
 */

import java.util.Scanner;

public class Q12MiddleCharacter {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a string and declare a string variable for the entered value
        System.out.print("Please enter a string: ");
        String userValue = input.nextLine();

        //call the MiddleCharacter method using the user input and print the middle character
        System.out.println(MiddleCharacter(userValue));

    }

    //create a separate method to determine the middle character
    public static char MiddleCharacter(String a){
        //declare an int variable for the position of the middle character
        int middleCharPosition = (a.length() / 2);

        //declare a char variable for the middle character
        char middleChar = '*';

        //check to see if string is at least 3 characters - if not, give an error message
        if(a.length() >= 3){
            middleChar = a.charAt(middleCharPosition);
        }
        else{
            System.out.print("Please enter a string of at least 3 characters");
        }

        //return the middle character
        return middleChar;
    }
}
