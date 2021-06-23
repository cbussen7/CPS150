import java.util.Scanner;

public class R419DoLoopToWhileLoop {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = input.nextInt();
        double x = 0;
        double s = 0;

        while(s > 0.01){
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
        }

        /*
        do {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
            System.out.println(s);
            }
        while (s > 0.01);
        */
    }
}
