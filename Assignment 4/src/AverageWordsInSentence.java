/*
Christopher Bussen
CPS 150 02
Assignment 4
AverageWordsInSentence: string string; number (and also reprints the strings word by word)

program takes in two sentences from the user and determines and
calculates the average number of words in each sentence

ex1: user inputs i feel tired. AND it's time for bed. - program outputs 3.5
ex2: user inputs my phone is dead, don't text. AND please turn the tv off when you leave. - program outputs 7.0
ex3: user inputs i love bunnies. AND bunnies scare me - program outputs Make sure sentence ends with period AND 1.5 (second sentence won't be counted due to missing period)
ex4: user inputs please hand me a tissue now. AND sorry, i can't quite reach them. - program outputs 6.0
 */

import java.util.Scanner;

public class AverageWordsInSentence {
    public static void main(String[] args) {
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a sentence and declare a string variable for it
        System.out.print("Enter the first sentence and end with a period: ");
        String sentence1 = input.nextLine();

        //call method for first sentence using sentence1 as input
        int firstWordCount = firstSentence(sentence1);

        //prompt the user to enter another sentence and declare a string variable for it
        System.out.print("Enter the second sentence and end with a period: ");
        String sentence2 = input.nextLine();

        //call method for second sentence using sentence2 as input
        int secondWordCount = secondSentence(sentence2);

        //declare double variable for average words in sentence
        double averageWords = (firstWordCount + secondWordCount) / 2.0;

        //print average word count
        System.out.println("The average amount of words in each sentence is " + averageWords + " words");
    }

    public static int firstSentence(String x){
        //declare an int variable for word count in sentence 1
        int wordCount1 = 0;

        //use if statement to make sure sentence ends in period
        if(x.charAt(x.length()-1) == '.') {
            //use for loop to print and count words in first sentence
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == ' ' || x.charAt(i) == '.') {
                    //print the word before the space
                    System.out.println(x.substring(0, i));
                    //add one to the word count
                    wordCount1++;
                }
            }
        }
        else{
            System.out.println("Make sure sentence ends with period");
        }

        return wordCount1;
    }

    public static int secondSentence(String y){
        //declare an int variable for word count in sentence 2
        int wordCount2 = 0;

        //use if statement to make sure sentence ends in period
        if(y.charAt(y.length()-1) == '.') {
            //use for loop to print and count words in second sentence
            for (int i = 0; i < y.length(); i++) {
                if (y.charAt(i) == ' ' || y.charAt(i) == '.') {
                    //print the word before the space
                    System.out.println(y.substring(0, i));
                    //add one to the word count
                    wordCount2++;
                }
            }
        }
        else{
            System.out.println("Make sure sentence ends with period");
        }

        return wordCount2;
    }
}
