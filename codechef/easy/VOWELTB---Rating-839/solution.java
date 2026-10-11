/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++){
		    int p=sc.nextInt();
		    int sum=0;
		    int a[]={100,50,10,5,2,1};
		    int n[]=new int[6];
		    for(int j=0;j<6;j++){
		    n[j]=p/a[j];
		    sum+=n[j];
		    p=p%a[j];
		    }
		  //  for(int j=0;j<6;j++)
		    if(sum!=0)
		    System.out.println(sum);
		}
	}
}