import java.util.Scanner;

public class R44CPowersOfTwo {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = input.nextInt();

        int i = 0;

        while(Math.pow(2, i) < n){
            System.out.println((int)Math.pow(2, i));
            i++;
        }
    }
}
