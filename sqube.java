/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class sqube
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit"); // accepting limit
        int l = sc.nextInt();
        for(int i=1; i<=l; i++)
        {
            System.out.println("square = "+(i*i)); // printing squares
            System.out.println("cube = "+(i*i*i)); // printing cubes
        }
    }
}