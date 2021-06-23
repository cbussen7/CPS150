public class StarsAndStripesR41B {
    public static void main(String [] args){
        String stars = "*****";
        String stripes = "=====";

        int i = 0;
        while(i < 5){
            System.out.print(stars.substring(0, i));
            System.out.println(stripes.substring(i, 5));
            i++;
        }
    }
}
