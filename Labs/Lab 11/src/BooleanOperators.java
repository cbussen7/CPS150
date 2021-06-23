/*
Christopher Bussen
CPS 150 02
Lab 11
BooleanOperators: boolean boolean; string string string string string

program takes in two boolean values from the user and uses separate methods to
determine if either of them are true, both are true, they're not both true,
exactly one of the two is true, and if neither are true

ex1: user inputs true, false - program outputs At least one true, Not both true, At least one true, One true, Not both true
ex2: user inputs true, true - program outputs At least one true, Both true, At least one true, More or less than 1 true, Both true
ex3: user inputs false, true - program outputs At least one true, Not both true, At least one true, One true, Not both true
ex4: user inputs false, false - program outputs Neither true, Not both true, Neither true, More or less than 1 true, Not both true
ex5: user inputs 0, 1 - program outputs error
ex6: user inputs alpha, omega - program outputs error
 */

import java.util.Scanner;
public class BooleanOperators {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter two numbers and declare integer values for them
        System.out.print("Please enter values for a and b (enter true or false): ");
        boolean a = input.nextBoolean();
        boolean b = input.nextBoolean();

        //call all 5 operator methods
        OrGate(a, b);
        AndGate(a, b);
        NotGate(a, b);
        XorGate(a, b);
        DeMorgan(a, b);

    }

    //create method for or gate
    public static void OrGate(boolean x, boolean y){
        //use if statement and logical operators to see if x or y is true
        if(x || y){
            System.out.println("At least one true");
        }
        else{
            System.out.println("Neither true");
        }
    }

    //create method for and gate
    public static void AndGate(boolean x, boolean y){
        //use if statement and logical operators to see if x and y are true
        if(x && y){
            System.out.println("Both true");
        }
        else{
            System.out.println("Not both true");
        }
    }

    //create method for not gate
    public static void NotGate(boolean x, boolean y){
        //use if statement and logical operators to see if x and y are not true
        if(!x && !y){
            System.out.println("Neither true");
        }
        else{
            System.out.println("At least one true");
        }
    }

    //create method for xor gate
    public static void XorGate(boolean x, boolean y){
        //use if statement and logical operators to see if exactly one of x and y is true
        if((x && !y) || (!x && y)){
            System.out.println("One true");
        }
        else{
            System.out.println("More or less than 1 true");
        }
    }

    //create method for De Morgan's Law
    public static void DeMorgan(boolean x, boolean y){
        //use if statement and logical operators to see if both x or y aren't true
        if(!(x && y)){
            System.out.println("Not both true");
        }
        else{
            System.out.println("Both true");
        }
    }
}
