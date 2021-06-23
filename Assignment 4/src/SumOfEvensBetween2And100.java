/*
Christopher Bussen
CPS 150 02
Assignment 4
SumOfEvensBetween2And100: no inputs; number

program calculates and prints the sum of all even numbers between 2 and 100
 */

public class SumOfEvensBetween2And100 {
    public static void main(String [] args){
        //declare int variable for i
        int i;

        //declare int variable for the sum
        int sum = 0;

        //use for loop to add all even numbers from 2 to 100
        for(i = 2; i <= 100; i +=2){
            sum = sum + i;
        }

        //print the sum
        System.out.println(sum);
    }
}
