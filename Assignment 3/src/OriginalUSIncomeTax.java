/*
Christopher Bussen
CPS 150 02
Assignment 3
OriginalUSIncomeTax: number; number

program takes in a value for the user's yearly income and calculates/prints
their total amount of taxes based on the original US income tax system


ex1: user inputs 30000 - programs outputs 300.0
ex2: user inputs 72000 - program outputs 940.0
ex3: user inputs 99000 - program outputs 1720.0
ex4: user inputs 131567 - program outputs 3012.68
ex5: user inputs 269000 - program outputs 8700.0
ex6: user inputs 512120.9 - program outputs 20977.254
ex7: user inputs cookie - program outputs error

 */

import java.util.Scanner;

public class OriginalUSIncomeTax {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter their yearly income and declare a double variable for this value
        System.out.print("Please enter your yearly income: $");
        double yearlyIncome = input.nextDouble();

        //declare final double variables for tax rates and tax limits
        final double RATE1 = 0.01;
        final double RATE2 = 0.02;
        final double RATE3 = 0.03;
        final double RATE4 = 0.04;
        final double RATE5 = 0.05;
        final double RATE6 = 0.06;
        final double RATE1_LIMIT = 50000;
        final double RATE2_LIMIT = 75000;
        final double RATE3_LIMIT = 100000;
        final double RATE4_LIMIT = 250000;
        final double RATE5_LIMIT = 500000;

        //declare double variable for total tax in each bracket
        double tax1 = 0;
        double tax2 = 0;
        double tax3 = 0;
        double tax4 = 0;
        double tax5 = 0;
        double tax6 = 0;

        //use if statements to calculate taxes for different incomes
        if(yearlyIncome <= RATE1_LIMIT){
            tax1 = yearlyIncome * RATE1;
        }
        else if(yearlyIncome <= RATE2_LIMIT){
            tax1 = RATE1_LIMIT * RATE1;
            tax2 = (yearlyIncome - RATE1_LIMIT) * RATE2;
        }
        else if(yearlyIncome <= RATE3_LIMIT){
            tax1 = RATE1_LIMIT * RATE1;
            tax2 = (RATE2_LIMIT - RATE1_LIMIT) * RATE2;
            tax3 = (yearlyIncome - RATE2_LIMIT) * RATE3;
        }
        else if(yearlyIncome <= RATE4_LIMIT){
            tax1 = RATE1_LIMIT * RATE1;
            tax2 = (RATE2_LIMIT - RATE1_LIMIT) * RATE2;
            tax3 = (RATE3_LIMIT - RATE2_LIMIT) * RATE3;
            tax4 = (yearlyIncome - RATE3_LIMIT) * RATE4;
        }
        else if(yearlyIncome <= RATE5_LIMIT){
            tax1 = RATE1_LIMIT * RATE1;
            tax2 = (RATE2_LIMIT - RATE1_LIMIT) * RATE2;
            tax3 = (RATE3_LIMIT - RATE2_LIMIT) * RATE3;
            tax4 = (RATE4_LIMIT - RATE3_LIMIT) * RATE4;
            tax5 = (yearlyIncome - RATE4_LIMIT) * RATE5;
        }
        else{
            tax1 = RATE1_LIMIT * RATE1;
            tax2 = (RATE2_LIMIT - RATE1_LIMIT) * RATE2;
            tax3 = (RATE3_LIMIT - RATE2_LIMIT) * RATE3;
            tax4 = (RATE4_LIMIT - RATE3_LIMIT) * RATE4;
            tax5 = (RATE5_LIMIT - RATE4_LIMIT) * RATE5;
            tax6 = (yearlyIncome - RATE5_LIMIT) * RATE6;
        }

        //calculate total tax - sum of all taxes
        double totalTax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6;

        //print total tax
        System.out.println("Your total tax will be $" + totalTax);

    }
}
