import java.util.*;
public class Gradient {
    public static void main(String[] aegs) {
        //step1. definevariables
        double year;

        //step2. create a Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        //step3. prompt user to enter the first number
        System.out.println( "please enter the year here: ");
        int yearNumber = sc.nextInt();

        //step4. mathematic computaions
        double avg = ((1500 - 100) / 9.0);
        System.out.print("Time repair cost is: $");
        System.out.println(avg * (yearNumber - 1) + 100);
    }// end of program
}