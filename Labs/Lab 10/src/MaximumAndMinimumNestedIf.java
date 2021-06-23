/*
Christopher Bussen
CPS 150 02
Lab 10
MaximumAndMinimumNestedIf: number number number number; number number

program takes in a 4 different numbers from the user and determines and
prints both the maximum and the minimum


ex1: user inputs 5000, 0, 2000, 300 - program outputs 5000.0, 0.0
ex2: user inputs  60, 90, -3.67, 100.223 - program outputs 100.223, -3.67
ex3: user inputs  11.5, 3, 11.5, 8 - program outputs 11.5, 3.0
ex4: user inputs dog, cat, mouse, red - program outputs error
ex5: user inputs  -6357, 81, 80.9, 81 - program outputs 81.0, -6357.0
 */

import java.util.Scanner;
public class MaximumAndMinimumNestedIf {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner (System.in);

        //prompt user to enter 4 numbers and declare double variables for each of them
        System.out.print("Please enter 4 numbers (separate with a space): ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();

        //call maximum and minimum methods
        maximum(num1, num2, num3, num4);
        minimum(num1, num2, num3, num4);

    }

    public static void maximum(double a, double b, double c, double d){
        double maximum = 0;
        //use nested if statements for each number to see if it is the maximum
        if(a >= b){
            if(a >= c){
                if(a >= d){
                   maximum = a;
                }
                else{
                    maximum = d;
                }
            }
        }
        if(b >= a){
            if(b >= c){
                if(b >= d){
                    maximum = b;
                }
                else{
                    maximum = d;
                }
            }
        }
        if(c >= a){
            if(c >= b){
                if(c >= d){
                    maximum = c;
                }
                else{
                    maximum = d;
                }
            }
        }
        //print out the maximum
        System.out.println("The maximum is " + maximum);
    }

    public static void minimum(double a, double b, double c, double d){
        double minimum = 0;
        //use nested if statements for each number to see if it is the minimum
        if(a <= b){
            if(a <= c){
                if(a <= d){
                    minimum = a;
                }
                else{
                    minimum = d;
                }
            }
        }
        if(b <= a){
            if(b <= c){
                if(b <= d){
                    minimum = b;
                }
                else{
                    minimum = d;
                }
            }
        }
        if(c <= a){
            if(c <= b){
                if(c <= d){
                    minimum = c;
                }
                else{
                    minimum = d;
                }
            }
        }
        //print out the maximum
        System.out.println("The minimum is " + minimum);
    }
}
