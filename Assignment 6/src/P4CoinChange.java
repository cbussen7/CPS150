/*
Christopher Bussen
CPS 150 02
Assignment 6
P4CoinChange: int, int, int array ; int

program takes in a number from the user for the value to make change for, a number for the length of the array,
and coin values to fill that array - program then determines and prints out how many ways the given coin values
can make change for the value given by the user

ex1: user inputs 4, 3, 1, 2, 3 - program outputs 4
ex2: user inputs 10, 4, 2, 5, 3, 6 - program outputs 5
ex3: user inputs 11, 5, 2, 4, 5, 9, 13 - program outputs 3
ex4: user inputs 15, 6, 10, 12, 2, 6, 8, 20 - program outputs 0
ex5: user inputs 151.2, 2, 1, 2 - program outputs error
ex6: user inputs 10, 3, 1, 2, 3.5 - program outputs error
 */

import java.util.Scanner;

public class P4CoinChange {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the value to make change for and declare an int variable for it
        System.out.print("Enter the number of cents you want to make change for: ");
        int totalChange = input.nextInt();

        //prompt the user to enter the length of the array (number of coins) and declare an int variable for it
        System.out.print("Enter the number of coins you want to use to make change: ");
        int numOfCoins = input.nextInt();

        //declare an int array variable of the length given by the user
        int[] coins = new int[numOfCoins];

        //prompt the user to enter the values of the coins (numbers in the array)
        System.out.print("Enter the values of the coins you want to use to make change: ");

        //use a for loop to put the user's values into the array
        for(int i = 0; i < numOfCoins; i++){
            coins[i] = input.nextInt();
        }

        //call the method that determines the number of ways to make change in a print statement - use the desired change value, the number of coins (length of array), and the array with the value of the coins as parameters
        System.out.println(makeChange(totalChange, numOfCoins, coins) + " ways to make change for " + totalChange + " cents");


    }

    //create a separate (and recursive) method to determine the number of ways change can be made - should take in 2 ints (number to make change for and array length) and an int array (value of coins) and return an int
    public static int makeChange(int a, int b, int[] c){
        //check to see if user wants to make change for 0 - if so, return 1
        if(a == 0){
            return 1;
        }

        //check to see if user wants to make change for a negative number - if so, return 0
        if(a < 0){
            return 0;
        }

        //check to see if there are coins to make change with - if not, return 0
        if(b <= 0){
            return 0;
        }

        //declare an int variable for the number of ways to make change
        int waysToMakeChange = 0;

        //use this recursive method to find the number of ways to make change and update the number of ways to make change
        waysToMakeChange = makeChange(a, b - 1, c) + makeChange(a - c[b-1], b, c);

        //return the number of ways change can be made
        return waysToMakeChange;
    }
}
