

import java.util.Scanner;
public class PhoneBill {
    public static void main(String [] args){
        //Import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the number of minutes
        System.out.print("How many minutes did you use: ");

        //define int input variable for the number of minutes on phone
        int minutes = input.nextInt();

        //define double variable for the standard carrier charge
        double carrierCharges = 29.95;

        //define int variable to find how many minutes (if any) the user used over 300 minutes
        int moreMinutes = minutes - 300;

        //define double variable for additional minute charges
        double minCharge = 0;

        //if minutes is greater than 300, multiply each minute above 300 by 0.45 to account for extra charges
        if(moreMinutes > 0){
            //multiply extra minutes by.45 and assign to minuteCharges
            minCharge = minCharge + moreMinutes * 0.45;
        }

        //define double for total price - adds all charges and tax
        double totalPrice = (carrierCharges + minCharge) * 1.125;

        //print the total price
        System.out.println("Your monthly charge is $" + totalPrice);


    }
}
