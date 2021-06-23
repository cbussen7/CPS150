/*
Christopher Bussen
CPS 150 02
Long Week Project 4
ConvertLetterGradeToNumericGrade: string ; number (or possibly string)

program takes in a string from the user for their letter grade and calculates
and prints the numeric grade associated with the letter grade - acceptable letter
grades are: A+, A, A-, B+, B, B-, C+, C, C-, D+, D, D-, F

ex1: user inputs A+ - program outputs 4.0
ex2: user inputs b+ - program outputs 3.3
ex3: user inputs B- - program outputs 2.7
ex4: user inputs D - program outputs 1.0
ex5: user inputs F- - program outputs Invalid letter grade - please try again
ex6: user inputs bad grade - program outputs Invalid letter grade - please try again
 */

import java.util.Scanner;

public class ConvertLetterGradeToNumericGrade {
    public static void main(String [] args) {
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter their letter grade and declare a string variable for it
        System.out.print("Enter your letter grade: ");
        String grade = input.nextLine();

        //convert entered grade to uppercase
        grade = grade.toUpperCase();

        //check validity of letter grade entered using switch statement - if letter grade is invalid, make string empty
        switch (grade) {
            case "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F":
                break;
            default:
                grade = "";
        }

        //call method that converts letter grade to numeric grade using grade as parameter - if numeric grade is -1, print error message - otherwise, print numeric grade
        if(letterGradeToNumericGrade(grade) == -1){
            System.out.println("Invalid letter grade - please try again.");
        }
        else{
            System.out.println("The numeric grade is " + letterGradeToNumericGrade(grade));
        }

    }

    //create a separate method that converts a letter grade to a numeric grade - takes in a string and returns a double
    public static double letterGradeToNumericGrade(String a){
        //if string is empty, return -1
        if(a.length() == 0){
            return -1;
        }

        //declare a double variable for numeric grade
        double numericGrade = 0;

        //use a switch statement to assign numeric grades for each base letter grade
        switch (a.charAt(0)){
            case 'A':
                numericGrade = 4.0;
                break;
            case 'B':
                numericGrade = 3.0;
                break;
            case 'C':
                numericGrade = 2.0;
                break;
            case 'D':
                numericGrade = 1.0;
                break;
            case 'F':
                numericGrade = 0.0;
                break;
        }

        //if the grade has 2 characters, add 0.3 for a + (unless it's an A+) and subtract 0.3 for a -
        if(a.length() == 2){
            if(a.charAt(1) == '+' && a.charAt(0) != 'A'){
                numericGrade = numericGrade + 0.3;
            }
            else if(a.charAt(1) == '-'){
                numericGrade = numericGrade - 0.3;
            }
        }

        //return the numeric grade
        return numericGrade;
    }
}
