/*
Christopher Bussen
CPS 150 02
Assignment 5
RecursiveReverseOfString: string ; string

program takes in a string and determines/prints the reverse
of the string

ex1: user inputs flow - program outputs wolf
ex2: user inputs water - program outputs retaw
ex3: user inputs 1234 - program outputs 4321
ex4: user inputs book bag - program outputs gab koob
 */


import java.util.Scanner;

public class RecursiveReverseOfString {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a string and declare a string variable for the value
        System.out.print("Enter your string: ");
        String str = input.nextLine();

        //call method to reverse string using user input as parameter and print the reversed string
        System.out.println("The reversed string is " + reverse(str));

    }

    //create a separate method to reverse the string
    public static String reverse(String a){
        if(a.length() == 0){
            return a;
        }

        //call recursive method to return string without first letter then add first letter onto end
        return reverse(a.substring(1)) + a.charAt(0);
    }
}
