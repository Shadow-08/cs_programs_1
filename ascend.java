/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class ascend
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number"); // accepting the number
        int x = sc.nextInt();
        for(int i=0; i<10; i++) // arrangement loop nest
        {
            int a=x;
            while(a!=0)
            {
                int b = a%10;
                if(b == i)
                {
                    System.out.print(b+" "); // printing in order
                }
                a/=10;
            }
        }
    }
}