import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t, z, y, a, b, c;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0){
		    z=sc.nextInt();
		    y=sc.nextInt();
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    
		    if((z-y)>=a+b+c){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}