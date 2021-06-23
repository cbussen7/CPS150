/*
Christopher Bussen
CPS 150 02
Assignment 1
SliderDisplacement: number; number

program takes in a value from the user for θ2, and uses that and other
given variables to calculate and print out the displacement of the slider
in the mechanism

θ3 = sin-1((L1 + L2sinθ2) / L3)
L4 = L2cosθ2 + L3cosθ3

ex1: user inputs 0 - program outputs 93.246
ex2: user inputs 30 - program outputs 79.6
ex3: user inputs 156.98 - program outputs 28.589
ex4: user inputs xenon - program outputs error
ex5: user inputs -13.56 - program outputs 95.289
 */

import java.util.Scanner;
public class SliderDisplacement {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to input a value for θ2 (in degrees)
        System.out.print("Enter the value for θ2 (in degrees): ");

        //Declare a double variable to store the value of θ2
        double angle2 = input.nextDouble();
        //need to convert to radians so it can be used in later trig calculations
        angle2 = Math.toRadians(angle2);
        //System.out.println(angle2); -- used as a check

        //Declare a double variable to store the given value of the offset between the crank pin and slider pin
        double l1 = 30;

        //Declare a double variable to store the given length of the arm crank
        double l2 = 30;

        //Declare a double variable to store the given length of the connecting rod
        double l3 = 70;

        //Declare a double variable to store the value of θ3 – equal to sin^-1((L1 + L2sinθ2) / L3)
        double angle3 = Math.asin((l1 + l2*Math.sin(angle2)) / l3);
        //System.out.println(angle3); -- used as a check

        //Declare a double variable to store the value of the displacement of the slider
        double l4 = l2*Math.cos(angle2) + l3*Math.cos(angle3);

        //Print out the value of the displacement of the slider (L4)
        System.out.println("The total displacement of the slider is " + l4 + " cm");

    }
}
