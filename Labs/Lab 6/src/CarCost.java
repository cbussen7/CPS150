/*
Christopher Bussen
CPS 150 02
Lab 6
CarCost: number, number, number, number, number; number

program takes in a value from the user for the cost of a new car, the estimated miles
driven per year, the estimated gas price, the efficiency in miles per gallon, and the estimated
resale value after 5 years then calculates the total cost of owning the car for 5 years

Total cost = cost of new car + ((5*miles / efficiency) * gas price) – resale value

ex1: user inputs 30000, 15000, 2.5, 25, 10000 - program outputs 27500.0
ex2: user inputs 56500.62, 8200, 2.21, 21, 22500 - program outputs 38315.381
ex3: user inputs 42000, 5000, 2.11, 31, 30000 - program outputs 13701.612
ex4: user inputs five hundred, x, nine, apple, -10000 - program outputs error
ex5: user inputs -40000, 6545, 2.09, 35.5, 22000 - program outputs -60073.373
 */

//Import JOption class
import javax.swing.JOptionPane;
public class CarCost {
    public static void main(String [] args){

        //Prompt the user to input a value for the cost of a new car
        String input1 = JOptionPane.showInputDialog("Enter the cost of a new car: $");

        //Declare a double variable to store the value of the cost of a new car
        double newCar = Double.parseDouble(input1);

        //Prompt the user to input a value for the estimated number of miles driven per year
        String input2 = JOptionPane.showInputDialog("Enter the estimated number of miles per year: ");

        //Declare a double variable to store the value of the number of miles driven per year
        double miles = Double.parseDouble(input2);

        //Prompt the user to input a value for the estimated gas price
        String input3 = JOptionPane.showInputDialog("Enter the estimated gas price ($ per gallon): $");

        //Declare a double variable to store the value of the estimated gas price per gallon
        double gasPrice = Double.parseDouble(input3);

        //Prompt the user to input a value for the car’s efficiency in miles per gallon
        String input4 = JOptionPane.showInputDialog("Enter the car's efficiency (miles per gallon): ");

        //Declare a double variable to store the value of the car’s efficiency
        double efficiency = Double.parseDouble(input4);

        //Prompt the user to enter a value for the resale value after five years
        String input5 = JOptionPane.showInputDialog("Enter the car's resale value after 5 years: $");

        //Declare a double variable to store the resale value after five years
        double resale = Double.parseDouble(input5);

        //Declare a double variable to store the total cost of owning the car for five years
        double totalCost = newCar + ((5*miles / efficiency) * gasPrice) - resale;

        //Print out the total cost of owning the car for five years
        JOptionPane.showMessageDialog(null, "The total cost of owning a new car for 5 years is: $" + totalCost);

        //Declare a double variable to store the average price of a new hybrid car
        double newHybrid = 30000.0;

        //Declare a double variable to store the average price of a used hybrid car
        double usedHybrid = 20000.0;

        //Compare the total cost of the car to the price of a new hybrid car and a used hybrid car
        if(totalCost > newHybrid){
            JOptionPane.showMessageDialog(null, "It would likely be cheaper to buy a new hybrid car!");
        }
        else if(totalCost < newHybrid && totalCost > usedHybrid){
            JOptionPane.showMessageDialog(null, "It would likely be cheaper to buy a used hybrid car!");
        }
        else{
            JOptionPane.showMessageDialog(null, "It would likely be cheaper to stick with the new car!");
        }

        //End program
    }
}
