/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class salary
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name"); // accepting employye name
        String n = sc.nextLine();
        System.out.println("enter basic salary"); // accepting basic salary
        double basic = sc.nextDouble();
        double da = basic*30/100;
        double hra = basic*20/100;
        double pf = basic*12/100;
        double gr = basic*3.67/100;
        double gp = basic+da+hra; // calculating gross pay
        double np = gp-pf-gr;
        System.out.println("name = "+n);
        System.out.println("gross pay = "+gp);
        System.out.println("provident fund = "+pf);
        System.out.println("group insurance = "+gr);
        System.out.println("net pay = "+np);
    }
}