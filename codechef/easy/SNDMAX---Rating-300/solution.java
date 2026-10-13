import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n-- > 0)
	{
	    int a[]=new int[3];
	    a[0]=sc.nextInt();
	    a[1]=sc.nextInt();
	    a[2]=sc.nextInt();
	    Arrays.sort(a);
	    System.out.println(a[1]);
	    }
	    sc.close();
	

	}
}
