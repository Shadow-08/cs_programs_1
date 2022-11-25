/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class sumz
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number"); // accepting number
        int x = sc.nextInt();
        int p, s=0, sq=0, cb=0, n=0;
        while(x>0)
        {
            p = x%10;
            s += p; // sum of digits
            sq += p*p; // sum of squares
            cb += p*p*p; // sum of cubes
            n++; // number of digits
            x/=10;
        }
        System.out.println("sum = "+s);
        System.out.println("sum of squares = "+sq);
        System.out.println("sum of cubes = "+cb);
        System.out.println("number of digits = "+n);
    }
}