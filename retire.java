/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class retire
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age"); // accepting age
        int age = sc.nextInt();
        System.out.println("enter basic salary"); // accepting basic salary
        int basic = sc.nextInt();
        double da=0, rate=0;
        if(age<=40)
        {
            rate = 0.011*basic;
            da = 0.2*basic;
        }
        else if(age>40 && age<=50)
        {
            rate = 0.0125*basic;
            da = 0.3*basic;
        }
        else if(age>50 && age<60)
        {
            rate = 0.015*basic;
            da = 0.4*basic;
        }
        double salary = rate + da;
        System.out.println("monthly salary = "+(basic+salary)); // printing monthly salary
    }
}