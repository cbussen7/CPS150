/*
Christopher Bussen
CPS 150 02
Assignment 6
P5DistributeMangoesToPeople: int, int ; int, int, int, int

program takes in a number from the user for number of mangoes and a number for the number
of people and calculates and prints the number of ways the mangoes can be distributed for
each of the 4 cases below

4 cases:
1. mangoes and people considered identical -- number of ways = (m+n-1)C(n-1)
2. mangoes unique, people identical -- number of ways = (m+n-1)C(n-1) * m!
3. mangoes identical, people unique -- number of ways = (m+n-1)C(n-1) * (n-1)!
4. mangoes and people considered unique -- number of ways = (m+n-1)C(n-1) * (n-1)! * m!

ex1: user inputs 3, 2 - program outputs 4, 24, 4, 24
ex2: user inputs 7, 5 - program outputs 330, 1663200, 7920, 39916800
ex3: user inputs 9, 6 - program outputs 2002, 726485760, 240240, 1278945280
ex4: user inputs 2, 3 - program outputs 0, 0, 0, 0 -- can't properly distribute mangoes when there are more people than mangoes
ex5: user inputs 2.5, 3 - program outputs error
ex6: user inputs x, z - program outputs error
 */

import java.util.Scanner;

public class P5DistributeMangoesToPeople {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter number of mangoes and declare an int variable for this value
        System.out.print("Enter the number of mangoes to be distributed: ");
        int mangoes = input.nextInt();

        //prompt user to enter number of people and declare an int variable for this value
        System.out.print("Enter the number of people to distribute mangoes to: ");
        int people = input.nextInt();

        //declare an int variable for the factorial of the number of mangoes
        int mangoFactorial = 1;

        //use a for loop to calculate the factorial of the number of mangoes
        for (int i = 1; i <= mangoes; i++){
            mangoFactorial = mangoFactorial * i;
        }

        //declare an int variable for the factorial of the number of people - 1
        int peopleFactorial = 1;

        //use a for loop to calculate the factorial of the number of people - 1
        for (int j = 1; j <= people - 1; j++){
            peopleFactorial = peopleFactorial * j;
        }

        //in a print statement, call the method that determines number of ways for case 1 using number of mangoes and people as parameters
        System.out.println("Case 1: " + waysToDistributeCase1(mangoes, people) + " ways");

        //in a print statement, call the method that determines number of ways for case 2 using number of mangoes, people, and factorial of mangoes as parameters
        System.out.println("Case 2: " + waysToDistributeCase2(mangoes, people, mangoFactorial) + " ways");

        //in a print statement, call the method that determines number of ways for case 3 using number of mangoes, people, and factorial of people - 1 as parameters
        System.out.println("Case 3: " + waysToDistributeCase3(mangoes, people, peopleFactorial) + " ways");

        //in a print statement, call the method that determines number of ways for case 4 using number of mangoes, people, factorial of mangoes, and factorial of people - 1  as parameters
        System.out.println("Case 4: " + waysToDistributeCase4(mangoes, people, mangoFactorial, peopleFactorial) + " ways");

    }

    //create a separate method to calculate the binomial coefficient - should take in two ints and return an int
    public static int binomCoefficient (int x, int y){
        //declare an int variable for the coefficient
        int coefficient = 1;

        if(y > x - y){
            y = x - y;
        }

        //use a for loop to calculate the coefficient
        for(int i = 0; i < y; i++){
            coefficient = coefficient * (x - i);
            coefficient = coefficient / (i + 1);
        }

        //return the coefficient
        return coefficient;
    }

    //create a function that calculates the number of ways mangoes can be distributed for case 1 - should take in two ints and return an int
    public static int waysToDistributeCase1 (int a, int b){
        //check if mangoes are less than people - if so, return 0
        if(a < b){
            return 0;
        }

        //declare an int variable for the number of ways the mangoes can be distributed
        //calculate total ways by calling the method that calculates the binomial coefficient using mangoes + people - 1 and people - 1 as parameters
        int waysToDistribute1 = binomCoefficient(a + b - 1, b - 1);

        //return the number of ways mangoes can be distributed
        return waysToDistribute1;
    }

    //create a function that calculates the number of ways mangoes can be distributed for case 2 - should take in three ints and return an int
    public static int waysToDistributeCase2 (int c, int d, int e){
        //check if mangoes are less than people - if so, return 0
        if(c < d){
            return 0;
        }

        //declare an int variable for the number of ways the mangoes can be distributed
        //calculate total ways by calling the method that calculates the binomial coefficient using mangoes + people - 1 and people - 1 as parameters
        int waysToDistribute2 = binomCoefficient(c + d - 1, d - 1);

        //multiply the ways mangoes can be distributed by the factorial of the number of mangoes (e)
        waysToDistribute2 = waysToDistribute2 * e;

        //return the number of ways mangoes can be distributed
        return waysToDistribute2;
    }

    //create a function that calculates the number of ways mangoes can be distributed for case 3 - should take in three ints and return an int
    public static int waysToDistributeCase3 (int f, int g, int h){
        //check if mangoes are less than people - if so, return 0
        if(f < g){
            return 0;
        }

        //declare an int variable for the number of ways the mangoes can be distributed
        //calculate total ways by calling the method that calculates the binomial coefficient using mangoes + people - 1 and people - 1 as parameters
        int waysToDistribute3 = binomCoefficient(f + g - 1, g - 1);

        //multiply the ways mangoes can be distributed by the factorial of the number of people - 1 (h)
        waysToDistribute3 = waysToDistribute3 * h;

        //return the number of ways mangoes can be distributed
        return waysToDistribute3;
    }

    //create a function that calculates the number of ways mangoes can be distributed for case 4 - should take in 4 ints and return an int
    public static int waysToDistributeCase4 (int r, int s, int t, int u){
        //check if mangoes are less than people - if so, return 0
        if(r < s){
            return 0;
        }

        //declare an int variable for the number of ways the mangoes can be distributed
        //calculate total ways by calling the method that calculates the binomial coefficient using mangoes + people - 1 and people - 1 as parameters
        int waysToDistribute4 = binomCoefficient(r + s - 1, s - 1);

        //multiply the ways mangoes can be distributed by the factorial of the number of mangoes (t) and by the factorial of people - 1 (u)
        waysToDistribute4 = waysToDistribute4 * t * u;

        //return the number of ways mangoes can be distributed
        return waysToDistribute4;
    }
}
