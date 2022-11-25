/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class tax
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the annual income"); // accepting annual income
        int fincome = sc.nextInt();
        System.out.println("is an insurance policy available"); // accepting insurance status
        String s = sc.next();
        int income=0;
        double rate=0;
        if(s.equals("yes"))
        {
            income = fincome - 150000;
        }
        else
        {
            income = fincome;
        }
        if(income<=250000)
        {
            rate = 0;
        }
        else if(income>250000 && income<=500000)
        {
            rate = 0.1*(income-250000);
        }
        else if(income>500000 && income<=1500000)
        {
            rate = 5000 + 0.1*(income-500000);
        }
        else if(income>1500000 && income<=3000000)
        {
            rate = 10000 + 0.2*(income-1500000);
        }
        else if(income>3000000 && income<=5000000)
        {
            rate = 20000 + 0.2*(income-3000000);
        }
        else
        {
            rate = 30000 + 0.2*(income-5000000);
        }
        System.out.println("income tax = "+rate); // printing income tax
    }
}