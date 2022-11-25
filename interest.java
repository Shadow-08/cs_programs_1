/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class interest
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle, rate and time"); // accepting the principle rate and time
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double si = (p*r*t)/100; // calculating simple interest
        double ci = (p*(1+(r/100))*t); // calculating compound interest
        double diff = ci-si; // calculating the difference
        System.out.println("difference = "+diff);
    }
}