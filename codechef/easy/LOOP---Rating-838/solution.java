

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int A = sc.nextInt();
		    int B = sc.nextInt(); 
		    int M = sc.nextInt(); 
		    
		    int Val1 = Math.abs(B-A);
		    int Val2 = Math.abs(M-Val1);
		    System.out.println(Math.min(Val1, Val2));
		}
		sc.close();
	}
}