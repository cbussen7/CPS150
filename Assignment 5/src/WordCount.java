/*
Christopher Bussen
CPS 150 02
Assignment 5
WordCount: string ; number

program takes in a string from the user and determines and prints out the
number of words in the string

ex1: user inputs Mary had a little lamb - program outputs 5
ex2: user inputs I love to write - program outputs 4
ex3: user inputs x y   z baby  tissue towel - program outputs 6
ex4: user inputs charger - program outputs 1
 */

import java.util.Scanner;

public class WordCount {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a string and declare a string variable for the value
        System.out.print("Please enter your string: ");
        String message = input.nextLine();

        //call the word counting method with the user string as an input and print the number of words
        System.out.println("There are " + countWords(message) + " words in your string");

    }

    //create separate method to determine number of words in string - takes in a string and returns an int
    public static int countWords(String a){
        //declare an int variable for the word counter - start at 1
        int wordCount = 1;

        //if first character is a space, subtract one from the count
        if(a.charAt(0) == ' '){
            wordCount--;
        }

        //if final character is a space, subtract one from count
        if(a.charAt(a.length()-1) == ' '){
            wordCount--;
        }

        //declare a boolean variable for whether or not the last character was a space
        boolean recentSpace = false;

        //use for loop to determine number of words - loop through the string and find spaces
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == ' ' && !recentSpace){
                //if character is a space, add 1 to word count
                wordCount++;

                //change boolean variable for last character being a space to true
                recentSpace = true;
            }

            //when character is not a space, change boolean variable for last character being a space to false
            if(a.charAt(i) != ' '){
                recentSpace = false;
            }
        }

        //return the word count
        return  wordCount;
    }
}
