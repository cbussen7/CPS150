/*
Christopher Bussen
CPS 150 02
Exam 2
Q14SumOfOddsBetweenInts: number number ; number

program takes in 2 integer values from the user and calculates/prints out
the sum of all of the odd numbers between the 2 integers

ex1: user inputs 20, 30  - program outputs 125
ex2: user inputs -4, 10 - program outputs 21
ex3: user inputs x, 9 - program outputs Input must be an integer (as well as other warning messages)
ex4: user inputs 3, -2 - program outputs First integer must be smaller than second
ex5: user inputs 10, z - program outputs Input must be an integer (as well as other warning messages)
ex6: user inputs 2, 19 - program outputs 99
 */

import java.util.Scanner;

public class Q14SumOfOddsBetweenInts {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter smaller integer
        System.out.print("Please enter smaller integer: ");

        //initialize int variables
        int int1 = 0;
        int int2 = 0;

        //check to see if input is integer
        if(input.hasNextInt()){
            int1 = input.nextInt();
        }
        else{
            System.out.println("Input must be an integer");
        }

        //prompt user to enter larger integer
        System.out.print("Please enter larger integer: ");

        //check to see if input is integer
        if(input.hasNextInt()){
            int2 = input.nextInt();
        }
        else{
            System.out.println("Input must be an integer");
        }

        //initialize sum variable
        int sum = 0;

        if(int1 < int2) {
            //use for loop to add all odd ints between int1 and int2
            for (int i = int1; i <= int2; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                }
            }
            //print sum
            System.out.println("The total sum is: " + sum);
        }
        else{
            System.out.println("First integer must be smaller than second");
        }
    }
}

