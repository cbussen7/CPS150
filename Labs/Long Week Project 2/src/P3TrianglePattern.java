/*
Christopher Bussen
CPS 150 02
Long Week Project 2
P3TrianglePattern: no inputs ; string string string string string

program uses nested for loops to print out a triangle pattern of stars
that opens to the left

 */

public class P3TrianglePattern {
    public static void main(String [] args){
        //use nested for loops to print the pattern
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++){
                //print the star i times
                System.out.print("*");
            }
            //move to the next line before incrementing i
            System.out.println();
        }
    }
}