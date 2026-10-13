import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            while (a < b) {
                a *= 2;
            }
            if (a == b) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
	}
}
