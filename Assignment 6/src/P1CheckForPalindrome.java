/*
Christopher Bussen
CPS 150 02
Assignment 6
P1CheckForPalindrome: int, int array ; string

program takes in a number from the user for the length of the array as well as numbers to
fill that array then determines and prints out whether the numbers entered is a palindrome
(also prints out reversed array)

ex1: user inputs 8, 4, 6, 3, 5, 5, 3, 6, 4 - program outputs Palindrome = Yes
ex2: user inputs 4, 1, 2, 2, 1 - program outputs Palindrome = Yes
ex3: user inputs 11, 8, 7, 4, 7, 6, 5, 3, 2, 4, 6, 5 - program outputs Palindrome = No
ex4: user inputs 5, 87, 10, 11, 10, 87 - program outputs Palindrome = Yes
ex5: user inputs 5, 1.3, x, y, x, 1.3 - program outputs error
ex6: user inputs 2.0, 12, 12 - program outputs error
 */

import java.util.Scanner;

public class P1CheckForPalindrome {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter length of the array
        System.out.print("Enter the length of the number array: ");
        int numOfValues = input.nextInt();

        //declare an int array variable with the length given by the user
        int[] numArray = new int[numOfValues];

        //prompt the user to enter values for the array
        System.out.print("Enter the numbers for the array: ");

        //add the user's values to the array using a for loop
        for(int i = 0; i < numOfValues; i++){
            numArray[i] = input.nextInt();
        }

        //call method for determining a palindrome using the number array as a parameter - if it returns true, tell user it's a palindrome - otherwise say it is not
        if(isPalindrome(numArray)){
            System.out.println("Palindrome = Yes");
        }
        else{
            System.out.println("Palindrome = No");
        }

    }

    //create a separate method to determine if the array is a palindrome - should take in an int array and return a boolean
    public static boolean isPalindrome (int[] a) {
        //declare a new int array of the same length that will be used to reverse the array
        int[] reverseNumArray = new int[a.length];

        //use a for loop to reverse the number array
        for (int j = a.length - 1; j >= 0; j--) {
            reverseNumArray[a.length - 1 - j] = a[j];
        }

        //print the reversed array using a for loop
        for(int x = 0; x < a.length; x++){
            System.out.print(reverseNumArray[x] + " ");
        }

        //print a new line
        System.out.println();

        //if original and reversed arrays are not equal, return false
        for (int k = 0; k < a.length; k++) {
            if (a[k] != reverseNumArray[k]) {
                return false;
            }
        }
        //if arrays are equal, return true
        return true;
    }
}
