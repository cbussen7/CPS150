/*
Christopher Bussen
CPS 150 02
Long Week Project 2
P5StarHourglass: no inputs ; string string string string string

program uses nested for loops to print out an hourglass pattern of stars

 */

public class P5StarHourglass {
    public static void main(String [] args){
        //use for loops to print the top of the pattern
        for(int x = 1; x <= 5; x++){
            //nested for loop to print spaces
            for(int y = 1; y < x; y++){
                System.out.print(" ");
            }

            //print the stars with a space after
            for(int z = 5; z >= x; z--){
                System.out.print("* ");
            }

            //print a new line
            System.out.println();
        }

        //use for loops to print the bottom of the pattern
        for(int i = 1; i <= 5; i++){
            //nested for loop to print spaces
            for(int j = 5; j > i; j--){
                System.out.print(" ");
            }

            //print the stars with a space after
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }

            //print a new line
            System.out.println();
        }
    }
}
