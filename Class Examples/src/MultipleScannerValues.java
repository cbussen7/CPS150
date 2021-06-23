import java.util.Scanner;

public class MultipleScannerValues {
    public static void main(String[] args){
        //import scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 3 numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}
