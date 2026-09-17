import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (isr);
		int t=Integer.parseInt(br.readLine());
		while(t!=0)
		{
		    String input = br.readLine();
		    String i[]=input.split(" ");
		    int l=Integer.parseInt(i[0]),
		        r=Integer.parseInt(i[1]);
		    int ans = r*2 - l*2 + 1;
            System.out.println(ans);
		    t--;
		}
	}
}