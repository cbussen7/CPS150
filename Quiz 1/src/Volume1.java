//Testing output of question 3 on quiz 1

public class Volume1 {
    public static void main(String [] args){
        int cansPerPack = 6;
        final double CAN_VOLUME = 0.355; //Liters in a 12-ounce can
        double totalVolume = cansPerPack * CAN_VOLUME;

        System.out.print("A six-pack of 12-ounce cans contains ");
        System.out.print(totalVolume);
        System.out.println(" liters.");
    }
}
