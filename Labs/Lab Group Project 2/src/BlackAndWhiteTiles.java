/*
Christopher Bussen
CPS 150 02
Lab Group Project 2
BlackAndWhiteTiles: number, number; number, number, number, number, number

program takes in a value from the user for the total width of the space and tile width,
and calculates the total number of black, white, and gray tiles, and the width of the gap
on each side

# of groups = (total width - tile width) / (4 * tile width)
# of tiles = (# of groups * 4) + 1
# of black = # of groups + 1 -- one black per group and need one at the end
# of white = # of groups -- one white per group
# of gray = # of groups * 2 -- two grays per group

ex1: user inputs 150, 5 program outputs 29, 8, 7, 14, 2.5
ex2: user inputs 212, 8.5 - program outputs 21, 6, 5, 10, 16.75
ex3: user inputs 42391, 5000.5 - program outputs 5, 2, 1, 2, 8694.25
ex4: user inputs five hundred, x - program outputs error
ex5: user inputs -412, 6.25 - program outputs -63, -15, -16, -32, -9.125 -- doesn't make sense
because number is negative
 */

import javax.swing.JOptionPane;
public class BlackAndWhiteTiles {
    public static void main(String [] args){
        //import JOption class and prompt user to enter total width and tile width
        String input1 = JOptionPane.showInputDialog("Enter the total width: ");
        double totalWidth = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Enter the tile width: ");
        double tileWidth = Double.parseDouble(input2);

        //calculate number of groups
        int numGroups = (int) ((totalWidth - tileWidth) /  (4 * tileWidth));

        //calculate number of tiles
        int numTiles = 1 + (numGroups * 4);

        //calculate the number of black, white, and gray tiles
        int numBlack = numGroups + 1;
        int numWhite = numGroups;
        int numGray = 2 * numGroups;

        //calculate the gap
        double gap = (totalWidth - (tileWidth * numTiles)) / 2;

        //show results using dialog box
        JOptionPane.showMessageDialog(null, "Total number of tiles: " + numTiles + "\n Total number of black tiles: " + numBlack + "\n Total number of white tiles: " + numWhite + "\n Total number of gray tiles: " + numGray + "\n Gap on each side should be: " + gap + "inches");
    }
}

