/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class sumavg
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers"); // inputing the numbers
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = x+y+z; // calculating the sum
        int avg = sum/3; // calculating the average
        System.out.println("sum = "+sum);
        System.out.println("average = "+avg);
    }
}