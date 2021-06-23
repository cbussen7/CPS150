/*
Christopher Bussen
CPS 150 02
Long Week Project 4
ConvertNumberGradeToLetterGrade: number ; string

program takes in a number between 0 and 4 from the user for their numeric grade and determines
and prints the letter grade closest to the numeric grade -- NOTE: A 4.0 corresponds to an
A - there are no A+'s when converting from numeric grade to letter grade

ex1: user inputs 2.85 - program outputs B
ex2: user inputs 4 - program outputs A
ex3: user inputs 3.34 - program outputs B+
ex4: user inputs 1.841 - program outputs C-
ex5: user inputs x - program outputs error
ex6: user inputs 5.63 - program outputs Enter a numeric grade between 0 and 4.0
ex7: user inputs -0.5 - program outputs Enter a numeric grade between 0 and 4.0
 */

import java.util.Scanner;

public class ConvertNumberGradeToLetterGrade {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter their numeric grade and declare a double variable for it
        System.out.print("Enter your numeric grade: ");
        double grade = input.nextDouble();

        //call the method that converts a numeric grade to a letter grade using the user input grade as a parameter
        //if the returned string is empty, give user error message - otherwise print the letter grade
        if(numberGradeToLetterGrade(grade).equals("")){
            System.out.println("Enter a numeric grade between 0 and 4.0");
        }
        else{
            System.out.println("The letter grade is " + numberGradeToLetterGrade(grade));
        }

    }

    //create a separate method that converts a numeric grade to a letter grade - takes in a double and returns a string
    public static String numberGradeToLetterGrade(double a){
        //declare a string variable for the letter grade
        String letterGrade = "";

        //use if statements to change the letter grade variable to the correct value associated with the numeric grade
        //if the numeric grade is greater than 4 or less than 0, leave the string empty
        if(a > 4){
        }
        else if(a >= 3.85){
            letterGrade = "A";
        }
        else if(a >= 3.50){
            letterGrade = "A-";
        }
        else if(a >= 3.15){
            letterGrade = "B+";
        }
        else if(a >= 2.85){
            letterGrade = "B";
        }
        else if(a >= 2.50){
            letterGrade = "B-";
        }
        else if(a >= 2.15){
            letterGrade = "C+";
        }
        else if(a >= 1.85){
            letterGrade = "C";
        }
        else if(a >= 1.50){
            letterGrade = "C-";
        }
        else if(a >= 1.15){
            letterGrade = "D+";
        }
        else if(a >= 0.85){
            letterGrade = "D";
        }
        else if(a >= 0.35){
            letterGrade = "D-";
        }
        else if(a >= 0){
            letterGrade = "F";
        }
        else{
        }

        //return the letter grade
        return letterGrade;
    }
}

