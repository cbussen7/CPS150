/*
Christopher Bussen
CPS 150 02
Assignment 4
PrintEachCharacterOnNewLine: string ; char char char char char

program takes in a string from the user and prints each character from
the string on a new line

ex1: user inputs Harry - program outputs H
                                         a
                                         r
                                         r
                                         y
ex2: user inputs eye - program outputs e
                                       y
                                       e
 */

import java.util.Scanner;

public class PrintEachCharacterOnNewLine {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter a word and declare a string variable for the value entered
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        //use a for loop to print each character of the word on a new line
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
