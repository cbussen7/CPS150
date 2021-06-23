/*
Christopher Bussen
CPS 150 02
Assignment 2
VendingMachine: number number number; number

This program simulates a vending machine that gives change in
dollar coins and quarters

ex1: user inputs 2, 2, 175 - program outputs 0, 3
ex2: user inputs 10, 1, 525- program outputs 5, 0
ex3: user inputs 5.2, 3, 395.5 - program outputs error
ex4: user inputs x, y, z - program outputs error
ex5: user inputs 3, 0, -225 - program outputs 5, 1
 */

import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;

        System.out.print("Enter the bill value (1 = $1 bill, 5 = $5 bill, etc.): ");
        int billValue = input.nextInt();

        System.out.print("Enter the quarter value (1 = 1 quarter, 2 = two quarters, etc.): ");
        int quarterValue = input.nextInt();

        System.out.print("Enter item price in pennies: ");
        int itemPrice = input.nextInt();

        //compute change due
        int changeDue = (int) (PENNIES_PER_DOLLAR * (billValue + (quarterValue * 0.25)) - itemPrice);
        int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
        changeDue = changeDue % PENNIES_PER_DOLLAR;
        int quarters = changeDue / PENNIES_PER_QUARTER;

        //print change due
        System.out.printf("Dollar coins: %6d", dollarCoins);
        System.out.println();
        System.out.printf("Quarters: %6d", quarters);
        System.out.println();
    }
}
