public class InterestExample {
    public static void main(String [] args){
        double balance = 10000;
        double interest = 0.05;

        int year = 0;

        while(balance < 20000){
            balance = balance * 1.05;
            year ++;
        }
        System.out.println("It will take your balance " + year + " years to double");
    }
}
