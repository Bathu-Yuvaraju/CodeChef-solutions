/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    String s=sc.next();
		    String n=sc.next();
		    String e="";
		    for(int j=0;j<5;j++)
		    {
		        if(s.charAt(j)==n.charAt(j))
		        {
		            e=e+"G";
		        }
		        else{
		            e=e+"B";
		        }
		    }
		    System.out.println(e);
		}
	}
}