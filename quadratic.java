/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class quadratic
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a, b, and c"); // accepting values
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = (b*b-4*a*c); // finding discriminant
        if(d>=0)
        {
            double r1 = (-b+Math.sqrt(d))/2*a;
            double r2 = (-b-Math.sqrt(d))/2*a;
            System.out.println("root 1 = "+r1); // printing root 1
            System.out.println("root 2 = "+r2); // printing root 2
        }
        else
        {
            System.out.println("roots not possible");
        }
    }
}