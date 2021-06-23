/*
Write a Java program to print following pattern.
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

public class Q10NumberPattern {
    public static void main(String[] args){

        //use nested for loop to go through array and print the first 6 lines of the pattern
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            //print new line
            System.out.println();
        }

        //use another nested for loop to go through array and print bottom half of pattern
        for(int x = 7; x >= 1; x--){
            for(int y = 1; y <= x; y++){
                System.out.print(y + " ");
            }

            //print a new line
            System.out.println();
        }
    }
}
