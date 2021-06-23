/*
for (int i = 1; i <= height; i++)
{
   for (int j = 1; j <= width; j++) { System.out.print("*"); }
   System.out.println();
}
 */

import java.util.Scanner;

public class R430ForLoopStarRectangle {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the height: ");
        int height = input.nextInt();
        System.out.print("Please enter the width: ");
        int width = input.nextInt();

        for(int i = 1; i<= height * width; i++){
            System.out.print("*");
            if(i % width == 0){
                System.out.println("");
            }

        }
    }
}
