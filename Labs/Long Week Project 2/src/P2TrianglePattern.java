/*
Christopher Bussen
CPS 150 02
Long Week Project 2
P2TrianglePattern: no inputs ; string string string string string

program uses nested for loops to print out a triangle pattern of stars
that opens to the right

 */

public class P2TrianglePattern {
    public static void main(String [] args){
        //declare an int variable for the number of rows
        int rows = 5;

        //use nested for loops to print the pattern
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                //print the star i times
                System.out.print("* ");
            }
            //move to the next line before incrementing i
            System.out.println();
        }
    }
}
