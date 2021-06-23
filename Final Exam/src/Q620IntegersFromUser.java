/*
Write a Java Program which Takes 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.
 */

import java.util.Scanner;

public class Q620IntegersFromUser {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //declare an int array variable of length 20
        int[] numArray = new int[20];

        //prompt the user to enter 20 numbers
        System.out.print("Enter 20 integers: ");

        //use a for loop to add the integers to the array
        for(int i = 0; i < 20; i++){
            numArray[i] = input.nextInt();
        }

        //declare int variables for the number of positive numbers, negative numbers, odds, evens, and 0s
        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        int zeros = 0;

        //use for loop and if statements to go through each element and add to each respective variable
        for(int j = 0; j < 20; j++){
            //check for positive/negative/zeros together since they are related
            if(numArray[j] > 0){
                positive++;
            }
            else if(numArray[j] < 0){
                negative++;
            }
            else{
                zeros++;
            }

            //now check odd or even
            if(numArray[j] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        //print the how many of each kind of number there are
        System.out.println(positive + " positives");
        System.out.println(negative + " negatives");
        System.out.println(odd + " odds");
        System.out.println(even + " evens");
        System.out.println(zeros + " zeros");

    }
}
