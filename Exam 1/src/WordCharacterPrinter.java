/*
Christopher Bussen
CPS 150 02
Exam 1
WordCharacterPrinter: String; String, String, String

program takes in a word from the user and determines/prints out
the first, last, and middle characters

ex1: user inputs Harry - program outputs H, y, arr
ex2: user inputs Book - program outputs B, k, oo
ex3: user inputs towel - program outputs t, l, owe
 */

import java.util.Scanner;
public class WordCharacterPrinter {
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
