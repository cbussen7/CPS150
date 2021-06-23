/*
Christopher Bussen
CPS 150 02
Assignment 2
TicTacToeBoard: string, string, string string

program outputs a comb-shaped string three times and a bottom line
once in order to print the shape of a tic tac toe board

ex: program should output
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
 */

public class TicTacToeBoard {
    public static void main(String [] args){

        //declare a String variable for the comb-shaped string
        String comb = "+--+--+--+\n|  |  |  |\n";

        //declare a String variable for the bottom line - same as top part of comb
        String bottom = "+--+--+--+";

        //print the tic tac toe board by printing comb 3 times and bottom once
        System.out.println(comb + comb + comb + bottom);
    }
}
