/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class basic
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers"); // inputing the numbers
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x+y; // calculating sum
        int diff = x-y; // calculating difference
        int prod = x*y; // calculating product
        int rem = x%y; // calculating remainder
        System.out.println("sum ="+sum);
        System.out.println("difference = "+diff);
        System.out.println("product = "+prod);
        System.out.println("remainder = "+rem);
    }
}