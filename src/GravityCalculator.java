/*
 Christopher Bussen
 CPS 150 02
 Program: Gravity Calculator
 */
import java.util.Scanner;
public class GravityCalculator {
        public static void main(String[] args){//START
            //Step 1: defining constant gravity

            final double gravity = 9.81;
           //Step 2: import scanner
            Scanner userInput = new Scanner(System.in);

            //Step 3: define input and output variables
            double fallingTime, initialVelocity, initialPosition, currentPosition;

            //Step 4: prompt user to enter each of the input values and collect it5
            System.out.print("Please enter initial velocity: ");
            initialVelocity = userInput.nextDouble();

            System.out.print("Please enter initial position: ");
            initialPosition = userInput.nextDouble();

            System.out.print("Please enter falling time: ");
            fallingTime = userInput.nextDouble();

            //Step 5: solve the problem - x(t) = 0.5 * at^2 * vit + xi
            currentPosition = (0.5 * gravity * fallingTime * fallingTime);
            currentPosition = currentPosition + initialVelocity * fallingTime + initialPosition;

            //Step 6: report current position
            System.out.println("---------------------");
            System.out.print("The current position at time " + fallingTime + " seconds is equal to " + currentPosition + " meters");
        }
}//END
