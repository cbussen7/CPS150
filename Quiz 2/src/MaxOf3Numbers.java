import java.util.Scanner;

public class MaxOf3Numbers {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter 3 numbers and declare double variables for each of them
        System.out.print("Please enter 3 numbers (separate with a space): ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        //declare double variable to store the largest number
        double maximum = 0;

        //use nested if statements for each number to see if it is the maximum
        if(num1 >= num2){
            if (num1 >= num3){
                maximum = num1;
            }
            else{
                maximum = num3;
            }
        }
        if(num2 >= num1){
            if(num2 >= num3){
                maximum = num2;
            }
            else{
                maximum = num3;
                }
        }

        //print maximum
        System.out.println("The largest number is: " + maximum);
        }
}
