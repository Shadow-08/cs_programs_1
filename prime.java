/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class prime
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number"); // accepting the number
        int x = sc.nextInt();
        int c=0;
        for(int i=1; i<=x; i++) // checking for prime condition
        {
            if(x%i == 0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("prime"); // printing prime
        }
        else
        {
            System.out.println("not prime"); // printing not prime
        }
    }
}