public class R514SwapValues {
    public static void main(String [] args){
        int x = 3;
        int y = 4;

        falseSwap(x, y);
        //System.out.println(x + " " + y);
    }

    public static void falseSwap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
