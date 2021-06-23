/*
Christopher Bussen
CPS 150 02
Assignment 4
SyllableCounter: string ; number

program takes in a word from the user and determines and prints out
the number of syllables in the word

ex1: user inputs harry - program outputs 2
ex2: user inputs hairy - program outputs 2
ex3: user inputs hare - program outputs 1
ex4: user inputs the - program outputs 1
ex5: user inputs giannis antetokounmpo - program outputs 7
ex6: user inputs basketball- program outputs 3
 */

import java.util.Scanner;

public class SyllableCounter {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a word and declare a string variable for its value
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        //convert word to lowercase
        word = word.toLowerCase();

        //declare int variable for syllable count
        int syllableCount = 0;

        //declare boolean variable for whether or not previous character was a vowel
        boolean previousVowel = false;

        //use for loop to check for vowels in the word
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y'){
                //if character is a vowel and previous character was not a vowel, add 1 to syllable count
                if(!previousVowel) {
                    syllableCount++;
                }
                previousVowel = true;
            }
            //switch previous vowel variable back to false if character isn't a vowel
            else{
                previousVowel = false;
            }
        }

        //if final letter is an e, subtract a syllable from the count
        if(word.charAt(word.length()-1) == 'e'){
            syllableCount --;
        }

        //if syllable count is 0, change it to 1
        if(syllableCount == 0){
            syllableCount = 1;
        }

        //print the syllable count
        System.out.println(syllableCount + " syllable(s)");
    }
}
