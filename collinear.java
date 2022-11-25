/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class collinear
{
    public static void main(int x1, int x2, int x3, int y1, int y2,  int y3) // accepting coordinates
    {
        double s1 = (y2-y1)/(x2-x1); // calculating slope
        double s2 = (y3-y2)/(x3-x2); // calculating slope
        if(s1==s2)
        {
            System.out.println("collinear points");
        }
        else
        {
            System.out.println("non-collinear points");
        }
    }
}