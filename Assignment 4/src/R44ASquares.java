import java.util.Scanner;

public class R44ASquares {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = input.nextInt();

        int i = 0;

        while(i * i < n){
            System.out.println(i * i);
            i++;
        }
    }
}
