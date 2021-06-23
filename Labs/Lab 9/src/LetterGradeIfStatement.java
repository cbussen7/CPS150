/*
Christopher Bussen
CPS 150 02
Lab 9
LetterGradeIfStatement: number; String

program takes in a value from the user for their current grade
and determines/prints out the letter grade the user will receive
using if statements

ex1: user inputs 93.4 - program outputs A-
ex2: user inputs 78 - program outputs C+
ex3: user inputs 101.65 - program outputs A
ex4: user inputs x - program outputs error
ex5: user inputs -12.2 - program outputs F
 */

import java.util.Scanner;
public class LetterGradeIfStatement {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter their current grade and declare a double variable to store the value
        System.out.print("Please enter your current grade: ");
        double grade = input.nextDouble();

        //declare a string variable to store the value of the user's letter grade
        String letterGrade;

        //use if statements to decide what letter grade to print out
        if(grade >= 94){
            letterGrade = "A";
        }
        else if(grade >= 90){
            letterGrade = "A-";
        }
        else if(grade >= 87){
            letterGrade = "B+";
        }
        else if (grade >= 83){
            letterGrade = "B";
        }
        else if(grade >= 80){
            letterGrade = "B-";
        }
        else if(grade >= 77){
            letterGrade = "C+";
        }
        else if (grade >= 73){
            letterGrade = "C";
        }
        else if(grade >= 70){
            letterGrade = "C-";
        }
        else if(grade >= 60){
            letterGrade = "D";
        }
        else{
            letterGrade = "F";
        }

        //print out user's letter grade
        System.out.println("Your letter grade is " + letterGrade);
    }
}
