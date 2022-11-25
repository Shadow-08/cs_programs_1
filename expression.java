/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class expression
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers"); // inputing the numbers
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double m = (1/a)+(1/b)+(1/c); // first expression
        double n = (a/(a+b))+(b/(b+c))+(c/(c+a)); // second expression
        double p = m+n;
        System.out.println("result ="+p);
    }
}