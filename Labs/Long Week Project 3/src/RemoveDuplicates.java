/*
Christopher Bussen
CPS 150 02
Long Week Project 3
Remove duplicates: numbers (amount of inputs depends on first number) ; number

program takes in a number for the array length from the user then takes in that many
numbers as inputs for the array - program then gets rid of any duplicate values, prints
the new array, and returns/prints the new length of the array

ex1: user inputs 3, 1, 1, 2 - program outputs 2
ex2: user inputs 10, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 - program outputs 5
ex3: user inputs 7, 0, 12, 0, 7, 0, 7, 3 - program outputs 4
ex4: user inputs 5, 2.5, 4, -10, 6, 91 - program outputs error
ex5: user inputs 4, y, z, cookie, remote - program outputs error
 */

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the length of the array and declare an int variable for it
        System.out.print("Enter the length of the array: ");
        int arrLength = input.nextInt();

        //declare an int array variable to hold the user's values
        int[] arr = new int [arrLength];

        //prompt the user to enter the values for the array and use a for loop to enter them in
        System.out.print("Enter the array values: ");
        for(int i = 0; i < arrLength; i++){
            arr[i] = input.nextInt();
        }

        //sort the array
        Arrays.sort(arr);

        //print the array's new length by calling the submethod
        System.out.println("The array's length without duplicates is " + deleteDupes(arr));

    }

    //create a separate method to remove duplicates from the array - takes in int array and returns int
    public static int deleteDupes(int[] a){
        //return the array's length if the length is less than 2
        if(a.length < 2){
            return a.length;
        }

        int k = 0;

        //use a for loop to delete the duplicates in the array
        for(int j = 1; j < a.length; j++){
            if(a[j] != a[k]){
                k++;
                a[k] = a[j];
            }
        }

        //print the new array using a for loop
        for(int x = 0; x < k+1; x++){
            System.out.print(a[x] + " ");
        }

        //print a new line
        System.out.println();

        //return the new array's length
        return k+1;
    }
}
