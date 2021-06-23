/*
Christopher Bussen
CPS 150 02
Assignment 3
ResistorTemperature: number; number

program takes in a value for the voltmeter voltage in a resistor and
calculates/prints out the gas temperature in degrees C when the voltage
is between 12 and 18 - prints an error when it isn't

T = (Rs/k) * (Vm/(Vs-Vm)) - (Ro/k)

ex1: user inputs 12 - programs outputs 25.0
ex2: user inputs 13.2 - program outputs 91.176
ex3: user inputs 18 - program outputs 1150.0
ex4: user inputs 11 - program outputs Voltmeter voltage must be between 12 and 18
ex5: user inputs x - program outputs error

 */

import java.util.Scanner;

public class ResistorTemperature {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter a value for voltmeter voltage and declare a double variable for the value
        System.out.print("Please enter the voltmeter voltage value: ");
        double voltmeterVoltage = input.nextDouble();

        //declare variables for Rs, k, Vs, and R0
        int Rs = 75;
        double k = 0.5;
        int Vs = 20;
        int R0 = 100;

        //declare variable for temperature
        double temperature;

        //use if statement to check if voltmeter voltage is within the correct range of values
        if(voltmeterVoltage >= 12 && voltmeterVoltage <= 18){
            temperature = (Rs * voltmeterVoltage) / (k * (Vs - voltmeterVoltage)) - (R0 / k);
            System.out.println("The temperature is " + temperature + " degrees Celsius");
        }
        else{
            System.out.println("Voltmeter voltage must be between 12 and 18");
        }
    }
}
