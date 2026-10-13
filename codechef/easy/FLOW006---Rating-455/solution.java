import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int sum = 0;
            while (n != 0) {
                int d = n % 10;
                sum += d;
                n /= 10;
            }
            System.out.println(sum);
        }
        scanner.close();

	}
}
