/*
Christopher Bussen
CPS 150 02
Long Week Project 3
SplitArray: number ; string

program takes in an int from the user that represents the new index to start
the array from and moves everything before that index to the end of the array
then prints the new array

array = {12, 10, 5, 6, 52, 36}

ex1: user inputs 2 - program outputs 5, 6, 52, 36, 12, 10
ex2: user inputs 1 - program outputs 10, 5, 6, 52, 36, 12
ex3: user inputs 6 - program outputs 12, 10, 5, 6, 52, 36
ex4: user inputs 1.5 - program outputs error
ex5: user inputs x - program outputs error
 */
import java.util.Scanner;

public class SplitArray {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter index of new start and declare an int variable for it
        System.out.print("Enter the index of the new start of the array: ");
        int newStart = input.nextInt();

        //declare an int array variable for the array given in the problem
        int[] arr = {12, 10, 5, 6, 52, 36};

        //use nested for loops to split the array at the given index
        for(int i = 0; i < newStart; i++){
            //declare an int variable for the first element in the array
            int x = arr[0];
            for(int j = 0; j < arr.length-1; j++){
                //move all elements after the first element up one
                arr[j] = arr[j+1];
            }

            //add the first element onto the end of the array
            arr[arr.length-1] = x;
        }

        //use for loop to print the array
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
