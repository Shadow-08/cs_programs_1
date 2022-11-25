/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class evedd
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number"); // accepting the number
        int n = sc.nextInt();
        if(n==0) // checking for 0 input
        {
            System.exit(0);
        }
        if(n%2 == 0)
        {
            System.out.println("even"); // printing even
        }
        else
        {
            System.out.println("odd"); // printing odd
        }
    }
}