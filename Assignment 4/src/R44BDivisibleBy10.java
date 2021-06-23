import java.util.Scanner;

public class R44BDivisibleBy10 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = input.nextInt();

        int i = 0;

        while(i < n){
            if(i % 10 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
