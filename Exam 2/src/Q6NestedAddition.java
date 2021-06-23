public class Q6NestedAddition {
    public static void main(String [] args){
        int x = 0;
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j < i; j++){
                x = x + j;
            }
        }

        System.out.println(x);
    }
}
