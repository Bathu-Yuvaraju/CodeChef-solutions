import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i< N; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i< N; i++) {
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }
            System.out.println(max - min);
        }
	}
}