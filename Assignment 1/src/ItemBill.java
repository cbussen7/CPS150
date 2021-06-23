/*
Christopher Bussen
CPS 150 02
Assignment 1
ItemBill: String string string number number number number number number; number

program takes in values for names of three different items, quantity of each
item, and price of each item, then calculates and prints the total price on the bill

Total=(quantity of each item * price of each item) * (1 + tax rate)

ex1: user inputs apple, orange, banana, 1, 1, 2, 5, 6, 7 - program outputs 26.5625
ex2: user inputs ketchup, mayo, crackers, 2, 2, 3, 3.5, 3.23, 2.5 - program outputs 22.27
ex3: user inputs 5, 8, 4, 5, 8, 4, cheese, water, granola - program outputs error
ex4: user inputs cheese, water, granola, 5.4, 1.2, 3, 5, 6, 9 - program outputs error
ex5: user inputs tissues, toilet paper, soap, 2, 1, 1, -6, -3, 1.2 - program outputs -14.6625
 */

import java.util.Scanner;
public class ItemBill {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to input a value for the name of the first item
        System.out.print("Enter the name of the first item: ");

        //Declare a string variable to store the value of the name of the first item
        String item1 = input.nextLine();

        //Prompt the user to input a value for the name of the second item
        System.out.print("Enter the name of the second item: ");

        //Declare a string variable to store the value of the name of the second item
        String item2 = input.nextLine();

        //Prompt the user to input a value for the name of the third item
        System.out.print("Enter the name of the third item: ");

        //Declare a string variable to store the value of the name of the third item
        String item3 = input.nextLine();

        //Prompt the user to input a value for the quantity of the first item
        System.out.print("Enter the quantity of " + item1 + ": ");

        //Declare an int variable to store the value of the quantity of the first item
        int quantity1 = input.nextInt();

        //Prompt the user to input a value for the quantity of the second item
        System.out.print("Enter the quantity of " + item2 + ": ");

        //Declare an int variable to store the value of the quantity of the second item
        int quantity2 = input.nextInt();

        //Prompt the user to input a value for the quantity of the third item
        System.out.print("Enter the quantity of " + item3 + ": ");

        //Declare an int variable to store the value of the quantity of the third item
        int quantity3 = input.nextInt();

        //Prompt the user to input a value for price of the first item
        System.out.print("Enter the price of " + item1 + ": ");

        //Declare a double variable to store the value of the price of the first item
        double price1 = input.nextDouble();

        //Prompt the user to input a value for price of the second item
        System.out.print("Enter the price of " + item2 + ": ");

        //Declare a double variable to store the value of the price of the second item
        double price2 = input.nextDouble();

        //Prompt the user to input a value for price of the third item
        System.out.print("Enter the price of " + item3 + ": ");

        //Declare a double variable to store the value of the price of the third item
        double price3 = input.nextDouble();

        //Declare a double variable to store the value of the tax rate (6.25%)
        double taxRate = 0.0625;

        //Declare a double variable to store the total price on the bill
        double totalPrice = (quantity1*price1 + quantity2*price2 + quantity3*price3) * (1+taxRate);

        //Print out the total bill price
        System.out.println("The total price of the bill will be $" + totalPrice);

    }
}
