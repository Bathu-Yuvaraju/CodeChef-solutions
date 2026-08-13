import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            String ans = "No";
            while (x > 0) {
                int d = x % 10;
                
                if (d == 7) {
                    ans = "Yes";
                    break;  
                }
                x /= 10;
            }
            System.out.println(ans);
        }
    }
}
