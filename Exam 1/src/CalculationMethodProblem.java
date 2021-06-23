public class CalculationMethodProblem {
    public static void main(String [] args){
        int x = 6;
        int y = 4;

        System.out.println("Calculation: " + calculation(x,y));
    }

    public static double calculation(int a, int b){
        double sum = a+b;
        sum = sum/2;
        return sum;
    }
}
