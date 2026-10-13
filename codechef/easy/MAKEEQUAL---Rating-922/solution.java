import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[][] arr = new int[N][K+1];
        for(int i = 0; i< N; i++) {
            for(int j = 0; j< K + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i = 0; i< N; i++) {
            int sum = 0;
            for(int j = 0; j< K; j++) {
                sum += arr[i][j];
            }
            if(sum >= M && arr[i][K] <= 10)
                count++;
        }
        System.out.println(count);
	}
}