import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

        while (a-- > 0) {
            int X = sc.nextInt();

            if (4 * X <= 1000) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
	}
}
