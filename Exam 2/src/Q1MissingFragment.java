import java.util.Scanner;

public class Q1MissingFragment {
    public static void main(String [] args){
        showStars(2);
        showStars(6);

    }

    public static void showStars(int number){
        for(int k = 1; k != number; k++){
            System.out.print("*");
        }
    }
}
