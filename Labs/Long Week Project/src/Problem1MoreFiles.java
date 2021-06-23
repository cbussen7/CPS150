/*
Christopher Bussen
CPS 150 02
Long Week Project
Problem1MoreFiles: string string ; string

program takes in the name of an existing input file and a name for an output file
from the user and reads the contents of the input file into the output file then
switches the first and second half of the string in the file - finally, it prints
the reversed string

ex1: user inputs name of file that contains hello world - program will output  worldhello and enter this into the new output file
ex2: user inputs name of file incorrectly - program will output error
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1MoreFiles {
    public static void main(String [] args) throws IOException {
        // 1. Declare and create a new Scanner variable named keyboard for keyboard input Scanner
        Scanner keyboard = new Scanner(System.in);

        // 2. Declare 3 String variables named inputFileName, outputFileName, and line String
        String inputFileName;
        String outputFileName;
        String line;

        // 3. Declare a File variable named inputFile
        File inputFile;

        // 4. Declare a Scanner variable named fileReader
        Scanner fileReader;

        // 5. Declare a PrintWriter variable named fileOutput
        PrintWriter fileOutput;

        // 6. Declare 2 int variables named lineLength and middleIndex
        int lineLength;
        int middleIndex;

        // 7. Using the keyboard Scanner, get the inputFileName String as user input
        System.out.print("Please enter the name of the input file: ");
        inputFileName = keyboard.nextLine();

        // 8. Create a new File object with the inputFileName, assign it to the inputFile variable
        inputFile = new File(inputFileName);

        // 9. Create a new Scanner object with the inputFile, assign it to the fileReader variable
        fileReader = new Scanner(inputFile);

        // 10. Using the fileReader Scanner, get the line String from the input file // HINT: use the Scanner nextLine method
        line = fileReader.nextLine();

        // 11. Set the lineLength variable to the line's length // HINT: use the String length method
        lineLength = line.length();

        // 12. Set the middleIndex variable to the index of the line's middle character
        middleIndex = lineLength / 2;

        // 13. Reset the line variable to the String resulting from switching the 2 halves of the line // HINT: use the String length substring method and the String concatenation operator
        line = line.substring(middleIndex) + line.substring(0, middleIndex);

        // 14. Using the keyboard Scanner, get the outputFileName String as user input
        System.out.print("Please enter the name of the output file: ");
        outputFileName = keyboard.nextLine();

        // 15. Create a new PrintWriter object with the outputFileName, assign it to the fileOutput variable
        fileOutput = new PrintWriter(outputFileName);

        // 16. Using the fileOutput PrintWriter, write the line String to the output file // HINT: use the PrintWriter println method
        fileOutput.println(line);

        // 17. Close the fileReader Scanner
        fileReader.close();

        // 18. Close the fileOutput PrintWriter
        fileOutput.close();

        //added step - print the line
        System.out.println(line);

        // end main
    }

// end class CPS150_ProgrammingProject1
}
