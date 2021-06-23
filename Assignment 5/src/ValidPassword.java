/*
Christopher Bussen
CPS 150 02
Assignment 5
ValidPassword: string string ; string

program takes in a password string from a user, a confirmation of the same password,
and determines if the password is valid based on the following rules: at least 8 characters
long, has at least one uppercase and lowercase letter, and has at least one digit

ex1: user inputs Password1, Password 1 - program outputs Password is valid
ex2: user inputs waterBottle2, waterBottle2 - program outputs Password is valid
ex3: user inputs elephantS1, elephantG1 - program outputs Password not valid - passwords must match, be 8+ characters, include an uppercase and lowercase letter, and include a digit
ex4: user inputs abcdefg123, abcdefg123 - program outputs Password not valid - passwords must match, be 8+ characters, include an uppercase and lowercase letter, and include a digit
ex5: user inputs  iPhoneLover, iPhoneLover - program outputs Password not valid - passwords must match, be 8+ characters, include an uppercase and lowercase letter, and include a digit
ex6: user inputs  Pass12, Pass12 - program outputs Password not valid - passwords must match, be 8+ characters, include an uppercase and lowercase letter, and include a digit

 */

import java.util.Scanner;

public class ValidPassword {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a password and create a string variable for it
        System.out.print("Enter your password: ");
        String password = input.nextLine();

        //prompt the user to confirm the password and create a new string variable for this
        System.out.print("Confirm your password: ");
        String confirmation = input.nextLine();

        //call method that checks password and tell user whether or not password is valid - use password and confirmation as inputs
        if(checkPassword(password, confirmation)){
            System.out.println("Password is valid");
        }
        else{
            System.out.println("Password not valid - passwords must match, be 8+ characters, include an uppercase and lowercase letter, and include a digit");
        }

    }

    //create separate method that checks if password is valid - takes two strings as input and returns boolean
    public static boolean checkPassword(String a, String b){
        //declare boolean variable for whether or not the passwords are valid
        boolean valid = true;

        //declare boolean variables for each requirement
        boolean confirmationEqual = true;
        boolean length = true;
        boolean upperCase = true;
        boolean lowerCase = true;
        boolean digit = true;

        //check if password and confirmation (a and b) are the same - if not, change valid to false
        if(!(a.equals(b))){
            confirmationEqual = false;
        }

        //check if password (a) is at least 8 characters long - if not, change valid to false
        if(!(a.length() >= 8)){
            length = false;
        }

        //check if password has at least one uppercase letter - if not, change valid to false
        for(int i = 0; i < a.length(); i++){
            char x = a.charAt(i);
            if(Character.isUpperCase(x)){
                upperCase = true;
                break;
            }
            else{
                upperCase = false;
            }
        }

        //check if password has at least one lowercase letter - if not, change valid to false
        for(int j = 0; j < a.length(); j++){
            char y = a.charAt(j);
            if(Character.isLowerCase(y)){
                lowerCase = true;
                break;
            }
            else{
                lowerCase = false;
            }
        }

        //check if password has at least one digit - if not, change valid to false
        for(int k = 0; k < a.length(); k++){
            char z = a.charAt(k);
            if(z == '0' || z == '1' || z == '2' || z == '3' || z == '4' || z == '5' || z == '6' || z == '7' || z == '8' || z == '9'){
                digit = true;
                break;
            }
            else{
                digit = false;
            }
        }

        if(!confirmationEqual || !length || !upperCase || !lowerCase || !digit){
            valid = false;
        }

        return valid;
    }
}
