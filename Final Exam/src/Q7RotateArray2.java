/*
Write a program to shift every element of an array to circularly right by step size of 2.
E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 4 5 1 2 3
 */

import java.util.Scanner;

public class Q7RotateArray2 {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter length of array and declare an int variable for this value
        System.out.print("Enter length of array: ");
        int length = input.nextInt();

        //declare an int array of the given length
        int[] userArray = new int[length];

        //prompt user to enter numbers to be put in array
        System.out.print("Enter numbers to be put in array: ");

        //use for loop to enter numbers into array
        for(int i = 0; i < length; i++){
            userArray[i] = input.nextInt();
        }

        //call the method that rotates the array using the array of user numbers as a parameter
        shiftArray(userArray);

    }

    //create separate method for shifting array elements two to the right - should take in an int array and return nothing
    public static void shiftArray (int[] a){

        //declare two int variables to store the last two elements in the array
        int temp1 = a[a.length - 2];
        int temp2 = a[a.length - 1];

        //use for loop to shift remaining elements 2 to the right
        for(int j = a.length - 1; j >= 2; j--){
            a[j] = a[j - 2];
        }

        //make the first element in the array equal to the first temporary int variable from above
        a[0] = temp1;

        //make the second element in the array equal to the first temporary int variable from above
        a[1] = temp2;

        //use a for loop to print the rotated array
        for(int k = 0; k < a.length; k++){
            System.out.print(a[k] + " ");
        }
    }
}
