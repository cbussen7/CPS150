/*
Christopher Bussen
CPS 150 02
Lab 5
BalloonVolume: number; number number number --- it was only supposed to be 2 outputs but I added the original volume

program takes in a original diameter of balloon from the user and outputs
the new volumes if the balloon's diameter increases by 1 or 2 inches

Volume of sphere = (4/3)π(diameter/2)^3

ex1: user inputs 4 - program outputs 33.510, 65.449, 113.097
ex2: user inputs 8.64 - program outputs 337.706, 469.061, 630.700
ex3: user inputs 64.89 - program outputs 143064.520, 149781.144, 156704.767
ex4: user inputs three - program outputs error
ex5: user inputs -10.40 - program outputs -588.977, -434.892, -310.339
 */

import java.util.Scanner;
public class BalloonVolume {
    public static void main(String [] args){
        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to input a value for the diameter of the balloon
        System.out.print("Enter the diameter of the balloon: ");

        //Declare a double variable to store the value of the diameter that the user enters
        double firstDiameter = input.nextDouble();

        //Declare a double variable to store the volume of the sphere using the original diameter
        double firstVolume = 4 * Math.PI * Math.pow((firstDiameter/2), 3) / 3;

        //Print the original volume
        System.out.println("The original volume is: " + firstVolume);

        //Declare a double variable to store the value of the input diameter plus 1
        double secondDiameter = firstDiameter + 1;

        //Declare a double variable to store the volume of the sphere using the diameter plus 1
        double secondVolume = 4 * Math.PI * Math.pow((secondDiameter/2), 3) / 3;

        //Print the new volume
        System.out.println("The second volume is: " + secondVolume);

        //Declare a double variable to store the value of the input diameter plus 2
        double thirdDiameter = firstDiameter + 2;

        //Declare a double variable to store the volume of the sphere using the diameter plus 2
        double thirdVolume = 4 * Math.PI * Math.pow((thirdDiameter/2), 3) / 3;

        // Print the volume of the sphere using the diameter plus 2
        System.out.println("The final volume is: " + thirdVolume);
    }
}
