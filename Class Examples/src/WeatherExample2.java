import java.util.Scanner;
public class WeatherExample2 {
    public static void main(String [] args){
        //import scanner
        Scanner input = new Scanner(System.in);
        //prompt user to enter weather
        System.out.print("Is it sunny or rainy today? ");

        String weatherCheck = input.nextLine();
        //convert user input to lowercase
        weatherCheck = weatherCheck.toLowerCase();

        if(weatherCheck.equals("rainy")){
            //weather is rainy - take umbrella
            System.out.println("Take an umbrella!");
        }
        else if(weatherCheck.equals("sunny")){
            //weather is sunny - don't need umbrella
            System.out.println("No need for an umbrella!");
        }
        else if(weatherCheck.equals("snowing")){
            //weather is snowing
            System.out.println("Take your jacket!");
        }
    }
}