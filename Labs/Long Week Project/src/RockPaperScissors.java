import java.io.*;
import java.util.*;

/**
 * CPS 150, Fall 2020 semester
 *
 * Long Week Project: Rock, Paper, Scissors
 *
 * @authors *** Christopher Bussen ***
 *
 * RockPaperScissors: number ; string
 *
 * program takes in a number from the user which represents their choice of either
 * rock, paper, or scissors, generates a random number for the computer, and determines
 * and prints the outcome of the game based on the two integers
 *
 * examples below with each method
 */
public class RockPaperScissors
{
    // global named constant for random number generator
    static Random gen = new Random();

    // global named constants for game choices
    static final int ROCK = 1;
    static final int PAPER = 2;
    static final int SCISSORS = 3;

    // global names constants for game outcomes
    static final int PLAYER1_WINS = 11;
    static final int PLAYER2_WINS = 12;
    static final int DRAW = 3;

    // global named constant for error condition
    static final int ERROR = -1;

    /**
     * 1. Get human player's choice
     * 2. Get computer player's (random) choice
     * 3. Check human player's choice
     * 4. Check computer player's choice
     * 5. Announce winner
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        PrintStream output = System.out;

        int player1, player2;

        // get player 1 input as 1 (rock), 2 (paper or 3 (scissors)
        output.print("Choose 1 (rock), 2 (paper), or 3 (scissors): ");
        player1 = scan.nextInt();

        /*
         *
         * *** Add code here to validate that player1 has entered
         *     an integer between 1 and 3
         *     otherwise, ABORT the program
         */
        if(player1 < 1 || player1 > 3){
            System.out.println("ERROR - Please enter a number between 1 and 3");
            //end program
            System.exit(0);
        }


        // echo human player's choice
        System.out.print(" You chose ");
        if (player1 == ROCK) {
            System.out.println("rock");
        }
        else if (player1 == PAPER) {
            System.out.println("paper");
        }
        else {
            System.out.println("scissors");
        }

        // now computer picks one randomly

        output.println("Now I choose one ...");
    
    /*     
     *** Add code to and un-comment the following line so that
     player2 is set to a random integer between 1 and 3,
     using the gen Random object, ALREADY DECLARED AS
     A GLOBAL VARIABLE:
     */
        player2 = gen.nextInt(3) + 1;

        System.out.print(" I choose ");

        /*
         *
         * *** Add code here to output the computer's choice
         *     as "rock", "paper" or "scissors"
         */
        if (player2 == ROCK) {
            System.out.println("rock");
        }
        else if (player2 == PAPER) {
            System.out.println("paper");
        }
        else {
            System.out.println("scissors");
        }


        /*
         *
         * *** Add code below to compare player input against
         *     computer's choice and output results:
         *
         *     if human player chose ROCK:
         *       call rockChoice method with computer choice
         *       output the game's outcome (returned from rockChoice)
         *     otherwise, if human player chose PAPER:
         *       call paperChoice method with computer choice
         *       output the game's outcome (returned from paperChoice)
         *    otherwise, if human player chose SCISSORS:
         *       call scissorChoice method with computer choice
         *       output the game's outcome (returned from scissorChoice)
         */
        if(player1 == ROCK){
            rockChoice(player2);
        }
        else if(player1 == PAPER){
            paperChoice(player2);
        }
        else{
            scissorsChoice(player2);
        }

    } // end main


    /**
     *
     *
     * rockChoice(int) -> int
     *
     * method consumes the computer player's choice (ROCK, PAPER or SCISSORS),
     *   assuming the human player has chosen ROCK
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     *
     * ex1: rockChoice(ROCK) -> DRAW
     * ex2: rockChoice(PAPER) -> PLAYER2_WINS
     * ex3: rockChoice(SCISSORS) -> PLAYER1_WINS
     * ex4: rockChoice(0) -> ERROR
     * ex5: rockChoice(-1) -> ERROR
     * ex6: rockChoice(4) -> ERROR
     *
     * *** ADD METHOD CODE HERE ***
     */
    public static void rockChoice(int x){
        if(x == ROCK){
            System.out.println("DRAW");
        }
        else if(x == PAPER){
            System.out.println("PLAYER2_WINS");
        }
        else{
            System.out.println("PLAYER1_WINS");
        }
    }


    /**
     *
     *
     * paperChoice(int) -> int
     *
     * method consumes the computer player's choice (ROCK, PAPER or SCISSORS),
     *   assuming the human player has chosen PAPER
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     *
     * ex1: paperChoice(ROCK) -> PLAYER1_WINS
     * ex2: paperChoice(PAPER) -> DRAW
     * ex3: paperChoice(SCISSORS) -> PLAYER2_WINS
     * ex4: paperChoice(0) -> ERROR
     * ex5: paperChoice(-1) -> ERROR
     * ex6: paperChoice(4) -> ERROR
     *
     * *** ADD METHOD CODE HERE ***
     */
    public static void paperChoice(int x){
        if(x == ROCK){
            System.out.println("PLAYER1_WINS");
        }
        else if(x == PAPER){
            System.out.println("DRAW");
        }
        else{
            System.out.println("PLAYER2_WINS");
        }
    }


    /**
     *
     *
     * scissorsChoice(int) -> int
     *
     * method consumes the computer player's choice (ROCK, PAPER or SCISSORS),
     *   assuming the human player has chosen SCISSORS
     * method produces game outcome (PLAYER1_WINS, PLAYER2_WINS, or DRAW)
     *
     * ex1: scissorsChoice(ROCK) -> PLAYER2_WINS
     * ex2: scissorsChoice(PAPER) -> PLAYER1_WINS
     * ex3: scissorsChoice(SCISSORS) -> DRAW
     * ex4: scissorsChoice(0) -> ERROR
     * ex5: scissorsChoice(-1) -> ERROR
     * ex6: scissorsChoice(4) -> ERROR
     *
     * *** ADD METHOD CODE HERE ***
     */
    public static void scissorsChoice(int x){
        if(x == ROCK){
            System.out.println("PLAYER2_WINS");
        }
        else if(x == PAPER){
            System.out.println("PLAYER1_WINS");
        }
        else{
            System.out.println("DRAW");
        }
    }

} // end class RockPaperScissors