import java.util.Scanner;

public class FactorialOfNRecursive {
    public static void main(String[] args) {
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter an n value and declare an int variable for the value
        System.out.print("Please enter an n value: ");
        int nValue = input.nextInt();

        //call the factorial method with the user's n value as an input
        System.out.println(factorial(nValue));
    }

    //create separate method to calculate the factorial of n - takes in an int and returns an int
    public static int factorial(int n) {
        if(n <= 0){
            return 1;
        }
        int result = n * factorial(n-1);
        return result;
    }
}