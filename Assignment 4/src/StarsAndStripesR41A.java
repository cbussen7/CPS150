public class StarsAndStripesR41A {
    public static void main(String [] args){
        String stars = "*****";
        String stripes = "=====";

        int i = 0;
        while(i < 5){
            System.out.println(stars.substring(0, i));
            i++;
        }
    }
}
