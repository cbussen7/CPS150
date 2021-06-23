/*
Christopher Bussen
CPS 150 02
Assignment 6
P6MultiplyMatrices: int, int, int, int, int array, int array ; number of ints in the matrix (in the correct matrix format)

program takes in numbers from the user for the number of rows and columns in the first array,
number of rows and columns in the second array, values for the first and second arrays, then
calculates and prints the product of the two matrices

ex1: user inputs 2, 2, 2, 4, 3, 4, 2, 2, 1, 2, 1, 3 - program outputs 6, 16, 7, 18
ex2: user inputs 2, 2, 1, 2, 3, 4, 2, 2, 1, 1, 1, 1 - program outputs 3, 3, 7, 7
ex3: user inputs 1, 2, 3, 6, 2, 1, 7, -4 - program outputs -3
ex4: user inputs 2, 2, 1, 2, 3, 4, 1, 2, 11, 12 - program outputs Multiplication is not possible with given dimensions
ex5: user inputs 2.1, 1, 1.2, 2, 1, 1, 0.5 - program outputs error
ex6: user inputs 2, 1, x, y, 1, 2, 3, 4 - program outputs error
 */

import java.util.Scanner;

public class P6MultiplyMatrices {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the rows and columns in the first array and declare int variables for these values
        System.out.print("Enter the number of rows in the first array followed by the number of columns: ");
        int rowsArray1 = input.nextInt();
        int columnsArray1 = input.nextInt();

        //declare a 2D int array with the first set of dimensions
        int[][] array1 = new int[rowsArray1][columnsArray1];

        //prompt the user to enter values for the first matrix
        System.out.print("Enter values for the first matrix: ");

        //use nested for loop to enter values into first array
        for(int i = 0; i < rowsArray1; i++){
            for(int j = 0; j < columnsArray1; j++){
                array1[i][j] = input.nextInt();
            }
        }

        //prompt the user to enter the rows and columns in the second array and declare int variables for these values
        System.out.print("Enter the number of rows in the first array followed by the number of columns: ");
        int rowsArray2 = input.nextInt();
        int columnsArray2 = input.nextInt();

        //declare a 2D int array with the second set of dimensions
        int[][] array2 = new int[rowsArray2][columnsArray2];

        //prompt the user to enter values for the second matrix
        System.out.print("Enter values for the second matrix: ");

        //use nested for loop to enter values into second array
        for(int i = 0; i < rowsArray2; i++){
            for(int j = 0; j < columnsArray2; j++){
                array2[i][j] = input.nextInt();
            }
        }

        //call the method that multiplies two matrices using the dimensions of array 1 and array 2 and the two arrays as parameters
        multiplyMatrices(rowsArray1, columnsArray1, rowsArray2, columnsArray2, array1, array2);
    }

    //create a separate method that multiplies two matrices - should take in 4 ints (the dimensions of each array) and 2 2D int arrays and return nothing
    public static void multiplyMatrices (int a, int b, int c, int d, int[][] x, int[][] y){
        //check if the columns for array1 (b) and rows for array2 (c) are equal - if not, tell user multiplication is not possible and leave method
        if(b != c){
            System.out.println("Multiplication is not possible with given dimensions");
            return;
        }

        //declare a new 2D array to store the product matrix - should have number of rows in array 1 (a) and columns in array 2 (d)
        int[][] product = new int[a][d];

        //use nested for loops to calculate the product matrix
        for(int i = 0; i < a; i++){
            for(int j = 0; j < d; j++){
                for(int k = 0; k < c; k++){
                    product[i][j] += x[i][k] * y[k][j];
                }
            }
        }

        //use a nested for loop to print the product matrix - print each row then print a new line and go to the next row
        for(int m = 0; m < a; m++){
            for(int n = 0; n < d; n++){
                System.out.print(product[m][n] + " ");
            }

            System.out.println();
        }

    }
}
