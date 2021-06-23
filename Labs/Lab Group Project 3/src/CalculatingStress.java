/*
Christopher Bussen
CPS 150 02
Lab Group Project 3
CalculatingStress: number number; number

program takes in a value from the user for the angle and force
and uses these values to calculate/output the value for stress

stress = 6FLcosθ/(wh^2) -- unless this number is >= yield

ex1: user inputs 5000, 0 - program outputs 46.08
ex2: user inputs  60, 90- program outputs 0 (basically)
ex3: user inputs  51692, 5.5- program outputs 225.0
ex4: user inputs x, yard - program outputs error
ex5: user inputs  -6357, 81 - program outputs -9.164
 */

//import JOption class
import javax.swing.JOptionPane;
public class CalculatingStress {
    public static void main(String [] args){
        //declare and define variables given in table
        int location = 1800;
        int height = 125;
        int width = 75;
        int yield = 225;

        //prompt the user to enter a value for the force and declare a variable to store that value
        String input1 = JOptionPane.showInputDialog("Please enter the force (N): ");
        double force = Double.parseDouble(input1);

        //prompt the user to enter a value for the angle and declare a variable to store that value
        String input2 = JOptionPane.showInputDialog("Please enter the angle (degrees): ");
        double angle = Math.toRadians(Double.parseDouble(input2));

        StressCalculator(location, height, width, yield, force, angle);

    }

    public static void StressCalculator(int a, int b, int c, int d, double e, double f){
        //location = a, height = b, width = c, yield = d, force = e, angle = f
        double stress = 6 * e * a * Math.cos(f) / (c * Math.pow(b, 2));

        //use if statement to determine if stress will be equal to yield or not
        if(stress >= d){
            stress = d;
        }

        //print the value of stress
        JOptionPane.showMessageDialog(null,"The value of stress is " + stress + " MPa");
    }
}
