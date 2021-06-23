/*
Christopher Bussen
CPS 150 02 - Algorithms and Programming 1
Class Examples
10/5/20

ServingDrinksNestedIf: string: string

takes in drink order and outputs whether or not it will be served

examples
 */

import java.util.Scanner;
public class ServingDrinksNestedIf {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner (System.in);

        //prompt user to enter drink order and declare string variable for order
        System.out.print("What is your drink order? ");
        String order = input.nextLine();
        order = order.toLowerCase();

        //declare variable for age
        int age;

        //check if order is wine
        if(order.equals("wine")){
            //prompt user to enter age and assign age the value entered
            System.out.print("Please enter your age: ");
            age = input.nextInt();
            //check if user is 21 or older
            if(age >= 21) {
                System.out.println("Wine will be served.");
            }
            else {
                System.out.println("You must be 21 or older to order wine.");
            }
        }
        else{
            System.out.println("Your drink will be served.");
        }
    }
}
