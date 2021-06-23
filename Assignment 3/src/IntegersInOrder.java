/*
Christopher Bussen
CPS 150 02
Assignment 3
IntegersInOrder: number number number; string

program takes in 3 integers from the user and determines if the integers
are in either ascending or descending order as they were entered

ex1: user inputs 1, 2, 5 - programs outputs in order
ex2: user inputs 1, 5, 2 - program outputs not in order
ex3: user inputs 5, 2, -1 - program outputs in order
ex4: user inputs 1, 2, 2 - program outputs in order
ex5: user inputs 1, 2, x - program outputs error
ex6: user inputs 2.1, 3.1, 4.1 - program outputs error

 */

import java.util.Scanner;

public class IntegersInOrder {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter 3 integers and declare int variables for them
        System.out.print("Please enter 3 integers (separate with a space): ");
        int int1 = input.nextInt();
        int int2 = input.nextInt();
        int int3 = input.nextInt();

        //use if statements to check if numbers are in ascending or descending order
        if(int1 >= int2 && int2 >= int3){
            System.out.println("in order");
        }
        else if(int1 <= int2 && int2 <= int3){
            System.out.println("in order");
        }
        else{
            System.out.println("not in order");
        }
    }
}
