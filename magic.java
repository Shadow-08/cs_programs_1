/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class magic
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number"); // accepting the number
        int x = sc.nextInt();
        int z = x;
        while(z>9) // checking for magic condition
        {
            x=z;z=0;
            while(x>0)
            {
                int a = x/10;
                int b = a*10;
                int c = x-b;
                z += c;
                x=a;
            }
        }
        if(z == 1)
        {
            System.out.println("magic"); // printing magic
        }
        else
        {
            System.out.println("not magic"); // printing not magic
        }
    }
}