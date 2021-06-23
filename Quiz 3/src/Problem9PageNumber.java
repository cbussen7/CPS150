import java.util.Scanner;

public class Problem9PageNumber {
    public static void main(String [] args) {
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter page number and declare an int variable for the value
        System.out.print("Please enter a page number: ");
        int page = input.nextInt();

        //if leftPage is true, print page number without space - otherwise add spaces
        if(pageSide(page)){
            System.out.println(page);
        }
        else{
            System.out.println("       " + page);
        }
    }

    //create method to check if page is even or odd and return boolean value
    public static boolean pageSide(int x){
        //declare boolean variable for left page - left is even
        boolean leftPage;

        //if statement to see if page is even - if so, left page is true
        if(x % 2 == 0){
            leftPage = true;
        }
        else{
            leftPage = false;
        }
        return leftPage;
    }
}
