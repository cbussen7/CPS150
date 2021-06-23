/*
Christopher Bussen
CPS 150 02
Long Week Project 3
CheckEqualArrays: int array int array ; string

program takes in two 11 integer array elements and determines if there
is a permutation of the first array that equals the second array - if
so, print yes, otherwise print no

ex1: user inputs [1 2 3 4 5 6 7 8 9 10 11], [11 1 2 10 9 3 4 8 7 5 6] - program outputs YES
ex2: user inputs [1 2 5 3 7 0 7 3 5 2 1], [7 3 1 2 5 0 5 2 1 3 7] - program outputs YES
ex3: user inputs [a b c d e f g h i j k], [a b c d e f g h i j k] - program outputs error
ex4: user inputs [1.5 2 3 4 5 6 7 8 9 10 11], [1.5 2 3 4 5 6 7 8 9 10 11] - program outputs error
ex5: user inputs [1 2 3 4 5 6 7 8 9 10 11], [6 5 4 3 2 0 11 10 9 8 7] - program outputs NO
 */


import java.util.Arrays;
import java.util.Scanner;

public class CheckEqualArrays {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the integers for the first array
        System.out.print("Enter 11 integers for the first array: ");

        //declare an int array variable with 11 elements and use a for loop to enter the user input
        int[] array1 = new int [11];
        for(int i = 0; i < 11; i++){
            array1[i] = input.nextInt();
        }

        //prompt the user to enter the integers for the second array
        System.out.print("Enter 11 integers for the second array: ");

        //declare another int array variable with 11 elements and use a for loop to enter the user input
        int[] array2 = new int [11];
        for(int i = 0; i < 11; i++){
            array2[i] = input.nextInt();
        }

        //call the method the checkArrays method in an if statement - use two user input arrays as inputs
        //if the method returns true, print yes, otherwise print no
        if(checkArrays(array1, array2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

    //create separate method that checks if arrays can be the same - takes two int arrays as input, returns boolean
    public static boolean checkArrays(int[] a, int[] b){
        //check to see if the arrays are the same length - if not, return false
        if(a.length != b.length){
            return false;
        }

        //sort the arrays
        Arrays.sort(a);
        Arrays.sort(b);

        //use for loop to check if all elements in both arrays are equal - if not, return false
        for(int x = 0; x < a.length; x++){
            if(a[x] != b[x]){
                return false;
            }
        }

        //return true if the for loop ends without returning false
        return true;
    }
}
