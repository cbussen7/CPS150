public class Program1Test {
    public static void main(String [] args){
        int i = 5;
        int j = 7;
        int k = 6;

        if((i < j) || (k < 5)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        if((i < j) && (k < 5)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
