/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class outcomes
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number"); // accepting the number
        int x = sc.nextInt();
        int s, t;
        for(int i=1; i<x; i++)
        {
            for(int j=i; j<=x; j++)
            {
                s=0;
                for(int k=i; k<=j; k++)
                {
                    s += k;
                }
                if(s == x) // checking for sum
                {
                    for(t=i; t<=j; t++)
                    {
                        System.out.print(t+" "); // printing outcomes
                    }
                    System.out.println();
                }
            }
        }
    }
}