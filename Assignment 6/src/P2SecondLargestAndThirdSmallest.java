/*
Christopher Bussen
CPS 150 02
Assignment 6
P2SecondLargestAndThirdSmallest: int, int array ; int int (possibly string)

program takes in a number from the user for the length of the array as well as numbers to
fill that array then determines and prints out the second largest number in the array and
the third smallest number in the array

ex1: user inputs 8, 4, 6, 3, 5, 5, 3, 6, 4 - program outputs 5, 5
ex2: user inputs 4, 1, 2, 2, 1 - program outputs 1, Error calculating third smallest number. -- this happens because there is no third smallest number
ex3: user inputs 11, 8, 7, 4, 7, 6, 5, 3, 2, 4, 6, 5 - program outputs 7, 4
ex4: user inputs 7, -5, 54, 87, 10, 11, 10, 87 - program outputs 54, 11
ex5: user inputs 5, 1.3, x, y, x, 1.3 - program outputs error
ex6: user inputs 2.0, 12, 12 - program outputs error
 */

import java.util.Arrays;
import java.util.Scanner;

public class P2SecondLargestAndThirdSmallest {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the length of the array
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();

        //declare an int array variable of the input length to store the numbers input by the user
        int[] userNumbers = new int[length];

        //prompt the user to enter values for the array
        System.out.print("Enter values to be put in array: ");

        //add the user's values into the array using a for loop
        for(int i = 0; i < length; i++){
            userNumbers[i] = input.nextInt();
        }

        //call the method that determines the second largest number using the original array as a parameter - if it returns -1, give an error message, otherwise print second largest number
        if(secondLargest(userNumbers) == -1) {
            System.out.println("Error calculating second largest number.");
        }
        else{
            System.out.println("Second largest = " + secondLargest(userNumbers));
        }

        //call the method that determines the third smallest number using the original array as a parameter - if it returns -1, give an error message, otherwise print the third smallest number
        if(thirdSmallest(userNumbers) == -1){
            System.out.println("Error calculating third smallest number.");
        }
        else{
            System.out.println("Third smallest = " + thirdSmallest(userNumbers));
        }

    }

    //create a separate method to find the second largest number - should take in an int array and return an int
    public static int secondLargest(int[] a){
        //sort the array
        Arrays.sort(a);

        //declare an int variable for the second largest number
        int secondLargest;

        //use a decrementing for loop to find the second largest number - start at length - 2 as max should be at index length - 1
        for(int j = a.length - 2; j >= 0; j--){
            //if the number is not equal to the last number in the array, it is the second largest number
            if(a[j] != a[a.length - 1]){
                secondLargest = a[j];
                //return the second largest number
                return secondLargest;
            }
        }

        //if for loop does not return value, return -1
        return -1;
    }

    //create a separate method to find the third smallest number - should take in an int array and return an int
    public static int thirdSmallest(int[] b){
        //sort the array
        Arrays.sort(b);

        //declare an int variable for the position of the second smallest number and the value of the third smallest number
        int positionSecondSmallest = b.length - 1;
        int thirdSmallest;

        //use an incrementing for loop to find the position of the second smallest number
        for(int k = 1; k < b.length; k++){
            //if the number is not equal to the first number in the array, it is the second smallest number
            if(b[k] != b[0]){
                //update the position of the second smallest number
                positionSecondSmallest = k;
                break;
            }
        }

        //use another incrementing for loop starting at the position of the second smallest number + 1 to find the third smallest number
        for(int x = positionSecondSmallest + 1; x < b.length; x++){
            //if the number is not equal to the second smallest number, it is the third smallest number
            if(b[x] != b[positionSecondSmallest]){
                thirdSmallest = b[x];

                //return the third smallest number
                return  thirdSmallest;
            }

        }

        //if the for loop does not return anything, return -1
        return -1;
    }
}
