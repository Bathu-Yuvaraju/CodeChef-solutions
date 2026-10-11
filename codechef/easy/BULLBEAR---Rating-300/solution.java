import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		   if ((x>y||x>z)&&(x<y||x<z))
              System.out.println(x);
          else if ((y>x||y>z)&&(y<x||y<z))
             System.out.println(y); 
           else
               System.out.println(z);
           
          
		}

	}
}