/**
 * By : Ahad Ulla Baig
 * Date : 22-08-2022
 * STD : 11 A
 */
import java.util.*;
public class shares
{
    public static void main(int x, int y, int r, int dis) // accepting variable values
    {
        double a, div;
        double z = x*y;
        a = z*dis/100;
        div = z*r/100;
        System.out.println("amount to be paid = "+a); // printing amount
        System.out.println("annual income = "+div); // printing annual income
    }
}