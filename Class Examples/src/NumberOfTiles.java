/*
NumberOfTiles: number number; number number number number

This program calculates the number of black and white tiles for a given width

Examples
 */

import javax.swing.JOptionPane;
public class NumberOfTiles {
    public static void main(String [] args){
        //Step 1: import JOption class and prompt user to enter total width and tile width
        String input1 = JOptionPane.showInputDialog("Enter the total width: ");
        double totalWidth = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Enter the tile width: ");
        double tileWidth = Double.parseDouble(input2);

        //System.out.println(totalWidth);
        //System.out.println(tileWidth);


        //computation
        //Step 2: calculate number of pairs
        int numPair = (int) ((totalWidth - tileWidth) /  (2 * tileWidth));

        //System.out.println(numPair);

        //Step 3: calculate number of tiles
        int numTiles = 1 + (numPair * 2);

        //System.out.println(numTiles);

        //Step 4: calculate the number of black and white tiles
        int numBlack = numPair + 1;
        int numWhite = numPair;

        //Step 5: calculate the gap
        double gap = (totalWidth - (tileWidth * numTiles)) / 2;

        //Step 6: show results using dialog box
        JOptionPane.showMessageDialog(null, "Total number of tiles: " + numTiles + "\n Total number of black tiles: " + numBlack + "\n Total number of white tiles: " + numWhite + "\n Gap on each side should be: " + gap + "inches");
    }
}
