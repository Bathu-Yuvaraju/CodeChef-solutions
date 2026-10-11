/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ref=new Scanner(System.in);
		char c=ref.next().charAt(0);
		
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
		    System.out.println("Vowel");
		}
		else{
		    System.out.println("Consonant");
		}
	}
}