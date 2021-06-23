import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String [] args){
        /*
        int [] myNum = {1, 3, 5, 7, 9};
        myNum[0] = 1000;
        System.out.println(myNum[0]);

        String[] cars = {"GM", "Ford", "Toyota", "Honda", "Mustang"};
        System.out.println(cars[4]);
        System.out.println("The size of the cars array is " + cars.length);

        for(int i = 0; i < 5; i++){
            System.out.println(cars[i]);

         */

        //int[] my num = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0]}
        int[] myNum = new int[10];
        for(int i = 9; i>= 0; i--){
            myNum[9-i] = i;
        }

        /*
        for(int i = 0; i <= 9; i++){
            System.out.println(myNum[i] + " ");

         */
        /*
        for(int i: myNum){
            System.out.println(myNum[i]);
        }
         */

        int[] myArray = {6, 3, 5, 8, 0, 10, 20, 5, 27, 5};

        //sort the array descending
        /*
        for(int k = 0; k < myArray.length - 1; k++) {
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    //swapping first variable with next
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }

         */

        //print max in array
        int max = myArray[0];
        int min= myArray[0];
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] > max){
                max = myArray[i];
            }
            if(myArray[i] < min){
                min = myArray[i];
            }
        }

        System.out.println("Max is " + max + ", Min is " + min);

        System.out.println(Arrays.toString(myArray));

        //sort array with easier method than above
        Arrays.sort(myArray);

        System.out.println(Arrays.toString(myArray));
        }
    }
