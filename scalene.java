/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class scalene
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 sides of a triangle"); // accepting the sides
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double s = x+y+z/2;
        double area = Math.sqrt((s*(s-x)*(s-y)*(s-z))); // calculating the area
        System.out.println("area = "+area); // printing the area
    }
}