import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        // Read the number of test cases first
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int X = sc.nextInt();
                int Y = sc.nextInt();

                // If X > Y, we need X - Y chairs. Otherwise, we need 0.
                System.out.println(Math.max(X - Y, 0));
            }
        }
        sc.close();
    }
}