/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class sgreat
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers"); // accepting numbers
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>y && x>z) // possibility 1
        {
            if(y>z)
            {
                System.out.println("second greatest number = "+y);
            }
            else
            {
                System.out.println("second greatest number = "+z);
            }
        }
        if(y>x && y>z) // possibility 2
        {
            if(x>z)
            {
                System.out.println("second greatest number = "+x);
            }
            else
            {
                System.out.println("second greatest number = "+z);
            }
        }
        if(z>x && z>y) // possibility 3
        {
            if(x>y)
            {
                System.out.println("second greatest number = "+x);
            }
            else
            {
                System.out.println("second greatest number = "+y);
            }
        }
    }
}