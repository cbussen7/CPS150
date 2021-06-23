/*
Christopher Bussen
CPS 150 02
Long Week Project 2
P4LetterPyramid: no inputs ; string string string string string

program uses nested for loops to print out a pyramid pattern of
letters that opens down

 */

public class P4LetterPyramid {
    public static void main(String [] args){
        //declare a string variable for the set of letters that will be used
        String letters = "ABCDEF";

        //use for loops to print the pattern
        for(int i = 1; i <= letters.length(); i++){
            //nested for loop to print spaces
            for(int j = letters.length(); j > i; j--){
                System.out.print(" ");
            }

            //print the letters up to the i position in the string
            for(int k = 0; k < i; k++){
                System.out.print(letters.charAt(k) + " ");
            }
            //print a new line
            System.out.println("");
        }
    }
}
