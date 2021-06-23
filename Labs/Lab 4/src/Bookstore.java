/*
Christopher Bussen
CPS 150 02
Lab 4
Bookstore: number number; number

program takes in the total price of the books and number of books - then
calculates tax and shipping fees and adds them to the price of the books
to output the total price of the order

ex1: user inputs 2, 100 - program outputs
ex2: user inputs 8, 158.6 - program outputs
ex3: user inputs 6.5, 55 - program outputs error
ex4: user inputs x, 128 - program outputs error
 */
import java.util.Scanner;
public class Bookstore {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the number of books they ordered
        System.out.print("How many books did you order: ");

        //declare an int variable to store the number of books in the order
        int books = input.nextInt();

        //prompt the user to enter the total price of the books
        System.out.print("How much did the books cost: $");

        //declare a double variable to store the price of the books
        double bookPrice = input.nextDouble();

        //declare a double variable to calculate and store the value of sales tax - 7.5%
        double tax = bookPrice * 0.075;

        //declare a double variable to calculate the cost of shipping - $2/book
        double shipping = books * 2;

        //declare variable to add up and store the total price - book price + tax + shipping
        double totalPrice = bookPrice + tax + shipping;

        //print the total price of the order
        System.out.println("Your total order price is $" + totalPrice);
    }
}
