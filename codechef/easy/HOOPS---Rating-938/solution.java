import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++){
		    int d = read.nextInt();
		    int l = read.nextInt();
		    int r = read.nextInt();
		    if(d >= l && d <= r){
		        System.out.println("Take second dose now");
		    }
		    else if(d < l){
		        System.out.println("Too Early");
		    }
		    else{
		        System.out.println("Too Late");
		    }
		}
	}
}