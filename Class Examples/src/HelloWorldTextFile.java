import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Date;

public class HelloWorldTextFile {
    public static void main(String [] args) throws FileNotFoundException {
        //open a file with the name "inout.txt"
        PrintWriter out = new PrintWriter("inout.txt");

        //add a few lines including name, email, class, date, time
        out.println("Hello, my name is Christopher Bussen - my email is bussenc1@udayton.edu");
        out.println("CPS 150 02 - Algorithms and Programming 1");
        out.println("The date and time is " +  new Date());

        //close the file
        out.close();

        //open the same file again
        Scanner in = new Scanner(new File("inout.txt"));

        //read the messages into individual string variables and print them
        String message = in.nextLine();
        String classCPS = in.nextLine();
        String date = in.nextLine();

        System.out.println(message);
        System.out.println(classCPS);
        System.out.println(date);
    }
}
