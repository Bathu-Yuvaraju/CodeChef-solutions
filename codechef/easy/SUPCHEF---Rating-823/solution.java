

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
	  Scanner sc =new Scanner(System.in);
	  t=sc.nextInt();
	  while(t-->0){
	   int m=sc.nextInt();
	   int n=sc.nextInt();
	   int k=sc.nextInt();
	    if((n*k)<m){
	       System.out.println("Yes");
	    }
	    else{
	        
	      System.out.println("No");  
	    }
	  }
	}
}