/*
Christopher Bussen
CPS 150 02
Long Week Project 3
LargestSubarray: number number number number number number number number ; number

program takes 8 numbers from the user to be used in an int array and
determines and prints out the maximum contiguous sum within the array

ex1: user inputs -2, -3, 4, -1, -2, 1, 5, -3 - program outputs 7
ex2: user inputs 1, 2, 3, 4, -1, -8, 5 - program outputs 10
ex3: user inputs -1, -2, -3, -4, -5, -6, -7, -8 - program outputs 0
ex4: user inputs 1.5, 2, 4, -10, 6, 91, 0, 1 - program outputs error
ex5: user inputs x, y, z, a, b, salt, mom, dad - program outputs error
 */

import java.util.Scanner;

public class LargestSubarray {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //declare an int array variable with 8 elements for the user's values
        int[] userValues = new int[8];

        //prompt the user to enter values for the array and use a for loop to add them to the array
        System.out.print("Enter 8 integers for the array: ");

        for(int i = 0; i < userValues.length; i++){
            userValues[i] = input.nextInt();
        }

        //print max - call method that finds the maximum contiguous string using the array with user values
        System.out.println("The maximum contiguous sum is " + maximumSum(userValues));

    }

    //create a separate method to determine the largest contiguous sum - takes in an int array and returns an int
    public static int maximumSum(int[] a){
        //declare an int variable for the max so far
        int maxSoFar = 0;

        //declare an int variable for the max ending after a specific element
        int maxEndingHere = 0;

        //use a for loop to go through each element of the array and find the max contiguous sum
        for(int j = 0; j < a.length; j++){
            maxEndingHere = maxEndingHere + a[j];

            if(maxSoFar < maxEndingHere){
                maxSoFar = maxEndingHere;
            }

            if(maxEndingHere < 0){
                maxEndingHere = 0;
            }
        }

        //return the max
        return maxSoFar;
    }
}
