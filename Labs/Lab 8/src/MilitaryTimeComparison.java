/*
Christopher Bussen
CPS 150 02
Lab 8
MilitaryTimeComparison: number number number number; number number number number

program takes in the hour number and minute number of two different
military times from the user and compares and prints out the earlier
time followed by the later time

ex1: user inputs 10, 12, 16, 20 - program outputs 10:12, 16:20
ex2: user inputs 12, 45, 8, 15 - program outputs 8:15, 12:45
ex3: user inputs -02, 37, 11, 12 - program outputs -02:37, 11:12
ex4: user inputs x, alpha, cookie, cheese - program outputs error
ex5: user inputs 1.4, 2, 3.9, 22 - program outputs error
 */

import java.util.Scanner;
public class MilitaryTimeComparison {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the hour number of the first time and declare an int variable to store the value
        System.out.print("Enter the hour number of the first time: ");
        int hour1 = input.nextInt();

        //prompt the user to enter the minute number of the first time and declare an int variable to store the value
        System.out.print("Enter the minute number of the first time: ");
        int minute1 = input.nextInt();

        //prompt the user to enter the hour number of the second time and declare an int variable to store the value
        System.out.print("Enter the hour number of the first time: ");
        int hour2 = input.nextInt();

        //prompt the user to enter the minute number of the second time and declare an int variable to store the value
        System.out.print("Enter the hour number of the first time: ");
        int minute2 = input.nextInt();

        //use if statements to compare the times and see which one should be printed first
        if(hour1 < hour2) {
            System.out.println(hour1 + ":" + minute1 + " comes before " + hour2 + ":" + minute2);
        }
        else if(hour1 == hour2){
            if(minute1 < minute2){
                System.out.println(hour1 + ":" + minute1 + " comes before " + hour2 + ":" + minute2);
            }
            else if(minute1 == minute2){
                System.out.println(hour1 + ":" + minute1 + " and " + hour2 + ":" + minute2 + " are the same time");
            }
            else{
                System.out.println(hour2 + ":" + minute2 + " comes before " + hour1 + ":" + minute1);
            }
        }
        else{
            System.out.println(hour2 + ":" + minute2 + " comes before " + hour1 + ":" + minute1);
        }
    }
}
