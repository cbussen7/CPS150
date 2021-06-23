/*
Christopher Bussen
CPS 150 02
Lab 13
WriteFile: string ; string

program takes in a message from the user and writes a text file with the message

example: user inputs "Hello world" - program outputs Hello world and stores in a text file
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {
    public static void main(String [] args) throws FileNotFoundException {
        //open a file with the name input.txt
        PrintWriter out = new PrintWriter("input.txt");

        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the message they want stored and declare a String variable for its value
        System.out.print("Please enter the message you want to be stored: ");
        String userMessage = input.nextLine();

        //store the user's message
        out.println(userMessage);

        //close the file
        out.close();

        //open the same file again
        Scanner in = new Scanner(new File("input.txt"));

        //read the message into a String variable
        String message = in.nextLine();

        //print the message
        System.out.println(message);

    }
}