public class R422LoopPrintResults {
    public static void main(String [] args){
        /*a
        int n = 1;
        for (int i = 2; i < 5; i++){
            n = n + i;
        }
        System.out.print(n);
         */

        /*b
        int i;
        double n = 1 / 2;
        for (i = 2; i <= 5; i++){
            n = n + 1.0 / i;
        }
        System.out.print(i);
         */

        /*c
        double x = 1;
        double y = 1;
        int i = 0;
        do
        {
            y = y / 2;
            x = x + y;
            i++;
        }
        while (x < 1.8);
        System.out.print(i);
         */

        //d
        double x = 1;
        double y = 1;
        int i = 0;
        while (y >= 1.5){
            x = x / 2;
            y = x + y;
            i++;
        }
        System.out.print(i);
    }
}
