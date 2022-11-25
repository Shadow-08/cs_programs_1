/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class flsum
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a 3 digit number"); // accepting the numbers
        int x = sc.nextInt();
        int y = x/100;
        int z = x%10;
        int sum = y+z; // calculating the sum
        System.out.println("sum of the first and last digit = "+sum); // printing the sum
    }
}