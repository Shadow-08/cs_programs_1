import java.util.*;
public class arr_s
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x[][] = new int[4][4], s=0;
        System.out.println("enter elements for the array");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                x[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                s += x[i][j];
            }
        }
        System.out.println("array :");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("sum = "+s);
    }
}