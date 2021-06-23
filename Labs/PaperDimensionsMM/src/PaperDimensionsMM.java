/*
Christopher Bussen
CPS 150 02
Assignment 2
PaperDimensionsMM; number number

program calculates and prints the dimensions of 8.5 inch by 11 inch
piece of paper converted into millimeter dimensions

1 inch = 25.4 millimeters

ex: program outputs 215.9, 279.4
 */

public class PaperDimensionsMM {
    public static void main(String[] args){

        //declare double variables for dimensions of paper in inches
        double width = 8.5;
        double length = 11.0;

        //declare double variables for converting inches to mm
        double mmWidth = width * 25.4;
        double mmLength = length * 25.4;

        //print the dimensions in mm
        System.out.println("The dimensions of a letter-size sheet of paper is " + mmWidth + " mm by " + mmLength + " mm");
    }
}
