/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class scheme
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter monthly deposit"); // accepting monthly deposit
        int m = sc.nextInt();
        System.out.println("enter number of months"); // accepting time
        int n = sc.nextInt();
        System.out.println("enter rate"); // accepting rate
        double r = sc.nextDouble();
        double p = m*n*(n+1)/2;
        double si = p*r/1200;
        double mv = (m*n)+si;
        System.out.println("maturity value = "+mv); // printing maturity value
    }
}