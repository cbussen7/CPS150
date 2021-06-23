/*
Christopher Bussen
CPS 150 02
Assignment 4
PowersOf2UpTo20: no inputs; 21 numbers

program calculates and prints the powers of 2 from 0 to 20
 */


public class PowersOf2UpTo20 {
    public static void main(String [] args){
        //declare int variable for i - exponent of 2
        int i;

        //use for loop to print powers of 2 starting from 0 and going to 20
        for(i = 0; i <= 20; i++){
            System.out.println(Math.pow(2, i));
        }
    }
}
