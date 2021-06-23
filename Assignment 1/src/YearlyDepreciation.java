/*
Christopher Bussen
CPS 150 02
Assignment 1
YearlyDepreciation: number number number; number

program takes in values for purchase price, salvage value, and expected
years of use and then calculates and prints the yearly depreciation value

D=(P-S)/Y where D=yearly depreciation, P=purchase price, S=salvage price, and
Y=expected years of use

ex1: user inputs 100, 50, 5 - program outputs 10.0
ex2: user inputs 820.46, 201.9, 9 - program outputs 68.728
ex3: user inputs 200, 75.5, 3.6 - program outputs error
ex4: user inputs x, y, abc - program outputs error
ex5: user inputs -500, -250.5, 4 - program outputs -62.375
 */

import java.util.Scanner;
public class YearlyDepreciation {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to input a value for the purchase price
        System.out.print("Enter the purchase price: ");

        //Declare a double variable to store the value of the purchase price
        double purchasePrice = input.nextDouble();

        //Prompt the user to input a value for the salvage value
        System.out.print("Enter the salvage value: ");

        //Declare an double variable to store the value of salvage value
        double salvageValue = input.nextDouble();

        //Prompt the user to input a value for number of years the item is used for
        System.out.print("Enter the number of years the item will be used for: ");

        //Declare an int variable to store the value of the number of years of use
        int years = input.nextInt();

        //Declare a double variable to store the value of the yearly depreciation
        double depreciation = (purchasePrice - salvageValue) / years;

        //Print out the value of the yearly depreciation
        System.out.println("The yearly depreciation value will be $" + depreciation);

    }
}
