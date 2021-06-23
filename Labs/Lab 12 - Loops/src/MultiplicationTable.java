/*
Christopher Bussen
CPS 150 02
Lab 12
MultiplicationTable: no inputs ; 100 numbers

program takes calculates/prints out a 10 by 10 multiplication table

no examples needed - only one output - results of all products 1-10*1-10
 */

public class MultiplicationTable {
    public static void main(String [] args){
        //initialize an int variable for product
        int product;

        //use a nested for loop to print the results of numbers 1-10 * numbers 1-10
        for(int i = 1; i <= 10; i++){
           for(int j = 1; j <= 10; j++){
               //multiply i and j
               product = i * j;

               //print product
               System.out.print(product + " ");
           }
           System.out.println("");
        }
    }
}
