/*
Christopher Bussen
CPS 150 02
Lab Group Project 2
RobotTilingFloor: number, number; number

program takes in values from the user for the row and column numbers, then
outputs a 0 if the tile will be black and 1 if the tile will be white

first row starts black, second row starts white, third row starts black, etc.

Examples:
 */

//Import JOption class
import javax.swing.JOptionPane;
public class RobotTilingFloor {
    public static void main(String [] args){
        //prompt user to enter the row number and store it as an int
        String input1 = JOptionPane.showInputDialog("Enter the row number: ");
        int row = Integer.parseInt(input1);

        //prompt user to enter the column number and store it as an int
        String input2 = JOptionPane.showInputDialog("Enter the column number: ");
        int column = Integer.parseInt(input2);

        //declare variable to indicate color
        int color;

        if(row % 2 != 0 && column % 2 != 0){
            color = 0;
        }

        //DIDN'T FINISH , could continue on with if statements for whether or not row/column is even or odd


    }
}
