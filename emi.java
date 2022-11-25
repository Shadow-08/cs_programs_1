/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class emi
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the loan amount"); // accepting loan amount
        int l = sc.nextInt();
        double ll, x, ls;
        ll = (double)l*0.9;
        ls = ll/100000;
        x = 0.1*l + ls*12*10*1450;
        System.out.println("total amount to be paid for 10 year time period"+x); // printing total amount
        x = 0.1*l + ls*12*12*1325;
        System.out.println("total amount to be paid for 12 year time period"+x); // printing total amount
        x = 0.1*l + ls*12*15*1250;
        System.out.println("total amount to be paid for 15 year time period"+x); // printing total amount
        x = 0.1*l + ls*12*18*1175;
        System.out.println("total amount to be paid for 18 year time period"+x); // printing total amount
        x = 0.1*l + ls*12*20*1100;
        System.out.println("total amount to be paid for 20 year time period"+x); // printing total amount
    }
}