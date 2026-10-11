import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(((a*2)+b)==((x*2)+y))
		System.out.println("Equal");
		else if(((a*2)+b)>((x*2)+y))
		System.out.println("Messi");
		else
		System.out.println("Ronaldo");
		 

	}
}