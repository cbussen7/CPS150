/*
Christopher Bussen
Lab 3
CPS 150 - The Java Class
 */
//Step 2: Import scanner
import java.util.Scanner;
public class AreaPerimeter{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //Steps 3/4: declare variable length and prompt user input
        System.out.print("Enter the rectangle's length: ");
        double length = input.nextDouble();
        //Steps 5/6: declare variable width and prompt user input
        System.out.print("Enter the rectangle's width: ");
        double width = input.nextDouble();
        //Steps 7/8: declare variable area to be used as output - store length*width in area
        double area = length * width;
        //Steps 9/10: declare variable perimeter to be used as output - store 2*length + 2*width in perimeter
        double perimeter = (2 * length) + (2 * width);
        //Steps 11/12: print area and perimeter values
        System.out.println("Area = " + area + ", Perimeter = " + perimeter);
    }
}