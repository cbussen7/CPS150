/*
Christopher Bussen
CPS 150 02
Lab 9
LetterGradeSwitchStatement: number; String

program takes in a value from the user for their current grade
and determines/prints out the letter grade the user will receive
using switch statements

ex1: user inputs 93 - program outputs A-
ex2: user inputs 78 - program outputs C+
ex3: user inputs 101.65 - program outputs error
ex4: user inputs x - program outputs error
ex5: user inputs -12 - program outputs F
 */

import java.util.Scanner;
public class LetterGradeSwitchStatement {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter their current grade and declare an int variable to store the value
        System.out.print("Please enter your current grade rounded to the nearest integer: ");
        int grade = input.nextInt();

        //declare a string variable to store the value of the user's letter grade
        String letterGrade;

        //use switch statements to decide what letter grade to print out
        switch(grade){
            case 100, 99, 98, 97, 96, 95, 94:
                letterGrade = "A";
                break;
            case 93, 92, 91, 90:
                letterGrade = "A-";
                break;
            case 89, 88, 87:
                letterGrade = "B+";
                break;
            case 86, 85, 84, 83:
                letterGrade = "B";
                break;
            case 82, 81, 80:
                letterGrade = "B-";
                break;
            case 79, 78, 77:
                letterGrade = "C+";
                break;
            case 76, 75, 74, 73:
                letterGrade = "C";
                break;
            case 72, 71, 70:
                letterGrade = "C-";
                break;
            case 69, 68, 67, 66, 65, 64, 63, 62, 61, 60:
                letterGrade = "D";
                break;
            default:
                letterGrade = "F";
        }

        //print the user's letter grade
        System.out.print("Your letter grade is " + letterGrade);
    }
}