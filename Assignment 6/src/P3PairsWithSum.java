/*
Christopher Bussen
CPS 150 02
Assignment 6
P3PairsWithSum: int, int, int array ; int

program takes in a number from the user for the desired sum, a number for the length of the array,
and numbers to fill that array - then determines and prints out how many pairs of numbers give that
sum (also prints the pairs)

ex1: user inputs 6, 4, 1 , 5, 7, -1 - program outputs 2
ex2: user inputs 6, 5, 1, 5, 7, -1, 5 - program outputs 3
ex3: user inputs 2, 4, 1, 1, 1, 1 - program outputs 6
ex4: user inputs 11, 13, 10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1 - program outputs 9
ex5: user inputs 5, 4, 1.3, x, y, x - program outputs error
ex6: user inputs 2.0, 2, 12, 12 - program outputs error
 */

import java.util.Scanner;

public class P3PairsWithSum {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the desired sum and declare an int variable for it
        System.out.print("Enter the desired sum: ");
        int sum = input.nextInt();

        //prompt the user to enter the length of the array and declare an int variable for it
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();

        //declare an int array variable of the given length for the array of numbers
        int[] numArray = new int[length];

        //prompt the user to enter values for the array
        System.out.print("Enter values to be put in the array: ");

        //use a for loop to enter the user's values into the array
        for(int i = 0; i < length; i++){
            numArray[i] = input.nextInt();
        }

        //declare an int variable for the number of pairs that add to the desired sum
        int numPairs = 0;

        System.out.print("Pairs that add to " + sum + ": ");

        //use nested for loops to find how many pairs of numbers add to the desired sum
        for(int j = 0; j < length; j++){
            for(int k = j + 1; k < length; k++){
                //if two of the numbers in the array add to the desired sum, add 1 to the number of pairs
                if(numArray[j] + numArray[k] == sum){
                    numPairs++;
                    //print the pairs that add to the sum
                    System.out.print("(" + numArray[j] + ", " + numArray[k] + ") ");
                }
            }
        }

        //print a new line
        System.out.println();

        //print the number of pairs that add to the sum
        System.out.println(numPairs + " pairs add to " + sum);
    }
}
