import java.util.Arrays;

public class FillArrayClassActivity {
    public static void main(String [] args){
        int [] scores = new int [5];
        int values = 10;

        System.out.println(Arrays.toString(fill(scores, values)));
    }

    public static int [] fill (int [] a, int b){
        for(int i = 0; i < a.length; i++){
            a[i] = b;
        }

        return a;
    }
}
