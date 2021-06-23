/*
Christopher Bussen
CPS 150 02
Lab 12
PrimeNumber: number ; string

program takes in an integer from the user and determines/prints
out whether or not the number is a prime number

ex1: user inputs 4 - program outputs 4 is not a prime number
ex2: user inputs 11 - program outputs 11 is a prime number
ex3: user inputs 101.65 - program outputs error
ex4: user inputs x - program outputs error
ex5: user inputs -5 - program outputs -5 is not a prime number
ex6: user inputs 7757 - program outputs 7757 is a prime number
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a number they want to check and declare an int variable for the value
        System.out.print("Please enter an integer: ");
        int userNumber = input.nextInt();

        //declare a boolean variable for whether or not the number is prime - false if number is less than 2, true otherwise
        boolean prime;
        if(userNumber < 2) {
            prime = false;
        }
        else{
            prime = true;
        }

        //use a for loop to check if the number is divisible by anything other than 1 and itself
        for(int i = 2; i <= userNumber / 2; i++){
            //declare an int variable for remainder - will be used to check if number evenly divides
            int remainder = userNumber % i;

            //use if statement to see if number evenly divides - if so, it's a factor and the number isn't prime
            if(remainder == 0){
                //change prime to false;
                prime = false;
            }
        }

        //use if statement to print whether or not the number is prime
        if(prime){
            System.out.println(userNumber + " is a prime number");
        }
        else{
            System.out.println(userNumber + " is not a prime number");
        }
    }
}
