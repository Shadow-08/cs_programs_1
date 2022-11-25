/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class call
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of calls"); // accepting number of calls
        int c = sc.nextInt();
        double ch;
        if(c<=50)
        {
            ch = 0; // calculating bill
            System.out.println("bill = "+(ch+180)); // printing final bill
        }
        if(c>50 && c<=150)
        {
            ch = (c-50)*1; // calculating bill
            System.out.println("bill = "+(ch+180)); // printing final bill
        }
        if(c>150 && c<=350)
        {
            ch = (100*1)+(c-150)*1.10; // calculating bill
            System.out.println("bill = "+(ch+180)); // printing final bill
        }
        if(c>350)
        {
            ch = (100*1)+(200*1.10)+(c-350)*1.20; // calculating bill
            System.out.println("bill = "+(ch+180)); // printing final bill
        }
    }
}