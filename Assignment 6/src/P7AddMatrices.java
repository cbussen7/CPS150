/*
Christopher Bussen
CPS 150 02
Assignment 6
P7AddMatrices: int, int, int, int, int array, int array ; number of ints in the matrix (in the correct matrix format)

program takes in numbers from the user for the number of rows and columns in the first array,
number of rows and columns in the second array, values for the first and second arrays, then
calculates and prints the sum of the two matrices

ex1: user inputs 2, 2, 1, 2, 3, 4, 2, 2, 1, 1, 1, 1 - program outputs 2, 3, 4, 5
ex2: user inputs 2, 2, 11, 9, -7, 102, 2, 2, -4, -19, 22, 4 - program outputs 7, -10, 15, 106
ex3: user inputs 1, 2, 3, 6, 2, 1, 7, -4 - program outputs Addition is not possible with given dimensions
ex4: user inputs 2, 2, 1, 2, 3, 4, 1, 2, 11, 12 - program outputs Addition is not possible with given dimensions
ex5: user inputs 2.1, 1, 1.2, 2, 1, 1, 0.5 - program outputs error
ex6: user inputs 2, 1, x, y, 1, 2, 3, 4 - program outputs error
 */

import java.util.Scanner;

public class P7AddMatrices {
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
        addMatrices(rowsArray1, columnsArray1, rowsArray2, columnsArray2, array1, array2);
    }

    //create a separate method that adds two matrices - should take in 4 ints (the dimensions of each array) and 2 2D int arrays and return nothing
    public static void addMatrices (int a, int b, int c, int d, int[][] x, int[][] y) {
        //check if the dimensions for array1 (a and b) and array2 (c and d) are equal - if not, tell user addition is not possible and leave method
        if (a != c || b != d) {
            System.out.println("Addition is not possible with given dimensions");
            return;
        }

        //declare a new 2D array to store the sum matrix - should have same dimensions as array 1 and array 2
        int[][] sum = new int[a][b];

        //use nested for loops to calculate the sum matrix
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sum[i][j] = x[i][j] + y[i][j];
            }
        }

        //use a nested for loop to print the sum matrix - print each row then print a new line and go to the next row
        for(int k = 0; k < a; k++){
            for(int z = 0; z < d; z++){
                System.out.print(sum[k][z] + " ");
            }

            System.out.println();
        }

    }
    }
