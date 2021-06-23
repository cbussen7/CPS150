/*
Write a Java program that reads a word and then prints the first character, the last character,
and the characters in the middle. For example, if the input is Harry, the program prints H y arr.
 */

import java.util.Scanner;

public class Q9FirstLastAndMiddleCharacters {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a word and declare a string variable to store the word
        System.out.print("Please enter a word: ");
        String userWord = input.nextLine();

        //declare string variables for the first character and last character
        String firstCharacter = userWord.substring(0,1);
        String lastCharacter = userWord.substring(userWord.length()-1);

        //declare a string variable for the middle characters
        String middleCharacters = userWord.substring(1, userWord.length()-1);

        //print first character, last character, and middle characters
        System.out.println(firstCharacter + " " + lastCharacter + " " + middleCharacters);

    }
}

