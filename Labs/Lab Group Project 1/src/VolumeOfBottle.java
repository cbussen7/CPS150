/*
Christopher Bussen
CPS 150 02
Lab Group Project 1
VolumeOfBottle: number number number number number; number

program takes in values for bottom radius, top radius, bottom height, top height,
and cone height then uses those inputs to calculate the volume of a bottle

V= π((r1^2 +r1*r2 +r2^2)(h1+h2+h3))/3

ex1: user inputs 1, 2, 3, 4, 5 - program outputs 87.964
ex2: user inputs 8.2, 4, 4.2, 1.32, 2.21 - program outputs 939.324
ex3: user inputs 2.44, 0.79, 3.677, 0.42, 0.9 - program outputs 44.506
ex4: user inputs one, two, abc, four, x - program outputs error
ex5: user inputs 1.8, 0.76, -4.2, -0.65, -1.25 - program outputs -33.125
 */

import java.util.Scanner;
public class VolumeOfBottle {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to input a value for the bottom radius
        System.out.print("Enter the value of the bottom radius: ");

        //Declare a double variable to store the value of the bottom radius (r1)
        double r1 = input.nextDouble();

        //Prompt the user to input a value for the top radius
        System.out.print("Enter the value of the top radius: ");

        //Declare a double variable to store the value of the top radius (r2)
        double r2 = input.nextDouble();

        //Prompt the user to input a value for the height of the bottom cylinder
        System.out.print("Enter the value of the height of the bottom cylinder: ");

        //Declare a double variable to store the height of the bottom cylinder (h1)
        double h1 = input.nextDouble();

        //Prompt the user to input a value for the height of the top cylinder
        System.out.print("Enter the value of the height of the top cylinder: ");

        //Declare a double variable to store the height of the top cylinder (h2)
        double h2 = input.nextDouble();

        //Prompt the user to input a value for the height of the cone
        System.out.print("Enter the height of the cone: ");

        //Declare a double variable to store the height of the cone (h3)
        double h3 = input.nextDouble();

        //Declare a double variable to store the volume of the bottle using the inputs
        double volume = Math.PI * ((Math.pow(r1, 2) + r1*r2 + Math.pow(r2, 2)) * (h1+h2+h3)) / 3;

        //Print the volume of the bottle
        System.out.println("The volume of the bottle is: " + volume);
    }
}
