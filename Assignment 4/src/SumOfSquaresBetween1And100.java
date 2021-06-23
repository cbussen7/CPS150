/*
Christopher Bussen
CPS 150 02
Assignment 4
SumOfSquaresBetween1And100: no inputs; number

program calculates and prints the sum of all squares between 1 and 100
 */

public class SumOfSquaresBetween1And100 {
    public static void main(String [] args){
        //declare int variable for i
        int i = 1;

        //declare int variable for the sum
        int sum = 0;

        //use while loop to add all squares between 1 and 100
        while(i * i <= 100){
            sum = sum + (i * i);
            i++;
        }

        //print the sum
        System.out.println(sum);
    }
    }
