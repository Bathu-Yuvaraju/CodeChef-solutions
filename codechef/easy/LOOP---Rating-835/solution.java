

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-->0) {
		    int ore= sc.nextInt();
		    int start = sc.nextInt();
		    int count =0;
		    while (start<ore) {
		        count++;
		        start = start + count;
		    }
		    System.out.println(count);
		}
		
	}
}