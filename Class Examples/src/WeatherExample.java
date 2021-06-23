import java.util.Scanner;
public class WeatherExample {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);
        //prompt user to enter weather
        System.out.print("Is it sunny or rainy today? Put 1 for sunny and 2 for rainy. ");

        int weatherCheck = input.nextInt();

        if(weatherCheck == 2){
            //weather is rainy
            System.out.println("Take an umbrella!");
        }
        else{
            //weather is sunny
            System.out.println("No need for an umbrella!");
        }
    }
}
