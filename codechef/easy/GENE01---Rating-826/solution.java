

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		
		if(a==b){
		    System.out.println(a);
		}else if(a=='R' || b=='R'){
		    System.out.println('R');
		}else if(a=='B' || b=='B'){
		    System.out.println('B');
		}else{
		    System.out.println('G');
		}
		
	}
}