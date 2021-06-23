/*
Christopher Bussen
CPS 150 02
Exam 2
Q10Sum3Values: number number number ; number

program takes in 3 numbers from the user and prints out the sum of
all of the digits that are not the same

ex1: user inputs 1, 2, 3 - program outputs 6
ex2: user inputs -10, 52, 11 - program outputs 53
ex3: user inputs 101.65, 2, 6 - program outputs error
ex4: user inputs x, y, z - program outputs error
ex5: user inputs 13, 13, 20 - program outputs 20
ex6: user inputs 78, 78, 78 - program outputs 0
 */

import java.util.Scanner;

public class Q10Sum3Values {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter 3 numbers and declare int variables for each one
        System.out.print("Please enter 3 integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        //call the sum method using the 3 values from the user as inputs
        Sum3Numbers(num1, num2, num3);

    }

    //create separate method to calculate sum of three numbers
    public static void Sum3Numbers(int a, int b, int c){
        //declare an int variable for the sum
        int sum = 0;

        //use if separate if statements to check if each number is different - if so, add to the sum
        if(a != b && a != c){
            sum = sum + a;
        }
        if(b != a && b != c){
            sum = sum + b;
        }
        if(c != a && c != b){
            sum = sum + c;
        }

        //print the sum of the three numbers
        System.out.println(sum);
    }
}
