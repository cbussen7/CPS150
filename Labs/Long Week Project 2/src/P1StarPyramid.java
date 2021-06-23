/*
Christopher Bussen
CPS 150 02
Long Week Project 2
P1StarPyramid: no inputs ; string string string string string

program uses nested for loops to print out a pyramid pattern of
stars that opens down

 */

public class P1StarPyramid {
    public static void main(String [] args){
        //use for loops to print the pattern
        for(int i = 1; i <= 5; i++){
            //nested for loop to print spaces
            for(int j = 5; j > i; j--){
                System.out.print(" ");
            }

            //print the stars with a space after
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }

            //print a new line
            System.out.println("");
        }
    }
}
