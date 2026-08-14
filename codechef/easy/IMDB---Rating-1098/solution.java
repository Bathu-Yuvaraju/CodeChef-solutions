import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=in.nextInt();
		    int x=in.nextInt();
		    int maxs=1;
		    for(int j=0;j<n;j++)
		    {
		        int s=in.nextInt();
		        int r=in.nextInt();
		        if(s<=x)
		        {
		           maxs=Math.max(maxs,r); 
		        }
		    }System.out.println(maxs);
		}
	}
}