/*
Christopher Bussen
CPS 150 02
Long Week Project 4
MaximumAverageOfSubarray: number ; number number

program takes in an int from the user that represents the length of the subarray
and then calculates and prints the starting index of the maximum average and the
maximum average of the subarray of the given length within the array

array = {1, 12, -5, -6, 50, 3}

ex1: user inputs 4 - program outputs 1, 12.75
ex2: user inputs 2 - program outputs 4, 26.5
ex3: user inputs 3 - program outputs 3, 15.667
ex4: user inputs 1.5 - program outputs error
ex5: user inputs x - program outputs error
 */

import java.util.Scanner;

public class MaximumAverageOfSubarray {
    public static void main(String[] args) {
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the length of the subarray and declare an int variable for this value
        System.out.print("Enter the length of the subarray: ");
        int length = input.nextInt();

        //declare an int array variable for the array given in the problem
        int[] arr = {1, 12, -5, -6, 50, 3};

        //call the method that determines the starting index and declare an int variable for this value
        int startIndex = calculateStartIndex(length, arr);

        //declare a double variable for sum of the subarray
        double sumSubarray = 0;

        //use for loop to calculate the sum of the subarray
        for(int i = startIndex; i < startIndex + length; i++){
            sumSubarray = sumSubarray + arr[i];
        }

        //declare a double variable for the max average of the array
        double maxAverage = sumSubarray / length;

        //print the starting index and the maximum average
        System.out.println("The subarray starts at index " + startIndex);
        System.out.println("The maximum average of the subarray is " + maxAverage);
    }

    //create a separate method to find the starting index of subarray with maximum average and length k - takes in an int and an int array, returns an int
    public static int calculateStartIndex(int x, int[] a) {
        //check to make sure given length of subarray (x) is less than length of the array (a) - if not, return -1
        if (x > a.length) {
            return -1;
        }

        //declare a new int array for the sum - same length as a
        int[] sum = new int[a.length];

        //use a for loop to fill the sum array
        for (int i = 1; i < a.length; i++) {
            sum[i] = sum[i - 1] + a[i];
        }

        //declare an int variable for the max sum - initialize as xth component in array
        int maxSum = sum[x - 1];

        //declare an int variable for the end position of the max sum - initialize as x-1
        int endIndex = x - 1;

        //use for loop to find the sum of other subarrays
        for (int j = x; j < a.length; j++) {
            //declare an int variable to for the sum of new subarray
            int newSum = sum[j] - sum[j - x];

            //if the new sum is greater than the max sum, make the new sum the max sum and update the end index
            if (newSum > maxSum) {
                maxSum = newSum;
                endIndex = j;
            }
        }

        //return the starting index of the maximum array - equal to end index - length of subarray + 1
        return endIndex - x + 1;
    }
}
