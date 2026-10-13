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
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (2L * n >= 1L * k * (k + 1)) { // larger multiplication
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
	}
}