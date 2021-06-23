
import java.util.*;
public class Problem2 {
public static void main(String ar[])
{
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int cols=sc.nextInt();
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=cols;j++)
        {
            if( i%2==0 && j%2!=0)
                System.out.print(" 1 ");
            else if( i%2!=0 && j%2==0)
                System.out.print(" 1 ");
            else
                System.out.print(" 0 ");
        }
        System.out.println();
    }
}

}
