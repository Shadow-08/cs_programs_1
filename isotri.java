/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class isotri
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter coordinates"); // accepting coordinates
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int xy = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1); // calculating distance
        int yz = (x3-x2)*(x3-x2)+(y3-y2)*(y3-y2); // calculating distance
        int zx = (x3-x1)*(x3-x1)+(y3-y1)*(y3-y1); // calculating distance
        if(xy==yz)
        {
            System.out.println("isoceles triangle");
        }
        if(yz==zx)
        {
            System.out.println("isoceles triangle");
        }
        if(zx==xy)
        {
            System.out.println("isoceles triangle");
        }
    }
}