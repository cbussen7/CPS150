public class Program2Test {
    public static void main(String [] args){
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        if(a && b){
            if(!c && !d){
                System.out.println("1");
            }
            else if(!d){
                System.out.println("2");
            }
            else{
                System.out.println("3");
            }
        }
        else if(c == d){
            System.out.println("4");
        }
        else if(c){
            System.out.println("5");
        }
        else{
            System.out.println("6");
        }

    }
}
