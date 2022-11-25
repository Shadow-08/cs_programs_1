/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class asa_num
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to check for armstrong number");
        System.out.println("enter 2 to check for special number");
        System.out.println("enter 3 to check for automorphic number");
        int x = sc.nextInt();
        switch(x)
        {
            case 1:
            int a, d, num, arm=0;
            System.out.println("enter the number"); // accepting number
            num = sc.nextInt();
            d = num;
            while(num>0) // checking for armstrong condition
            {
                a = num%10;
                num /= 10;
                arm += a*a*a;
            }
            if(arm == d)
            {
                System.out.println("the number is armstrong"); // printing armstrong
            }
            else
            {
                System.out.println("the number isn't armstrong"); // printing isn't armstrong
            }
            break;

            case 2:
            System.out.println("enter the number"); // accepting the number
            int nu = sc.nextInt();
            int sum=0, temp=nu;
            while(temp>0) // checking for special condition
            {
                int z=temp%10, fact=1;
                for(int i=1; i<=z; i++)
                {
                    fact=fact*i;
                }
                sum=sum+fact;
                temp=temp/10;
            }
            if(sum == nu)
            {
                System.out.println("the number is special"); // printing special
            }
            else
            {
                System.out.println("the number isn't special"); // printing not special
            }
            break;

            case 3:
            System.out.println("enter any number"); // accepting the number
            int n = sc.nextInt();
            int y=0, sqr=n*n, t=n;
            while(t>0)
            {
                y++;
                t/=10;
            }
            int digit = (int) (sqr%(Math.pow(10, y))); 
            if(n == digit) // checking for automorphic condition
            {
                System.out.println("the number is automorphic"); // printing automorphic
            }
            else
            {
                System.out.println("the number isn't automorphic"); // printing automorphic
            }
            break;

            default : System.out.println("WRONG INPUT!");
        }
    }
}