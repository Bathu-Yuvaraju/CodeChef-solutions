import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void solve(int arr[],int n){
        int count=0;
        int req=0;
        int arr_req[]=new int[8];
        for(int i=0;i<n;i++){
            if(arr[i]==1 || arr[i]==2 || arr[i]==3 || arr[i]==4 || arr[i]==5  || arr[i]==6 || arr[i]==7 ){
                count++;
            switch(arr[i]){
                case 1:
                    arr_req[1]=arr[i];
                    break;
                case 2:
                    arr_req[2]=arr[i];
                    break;
                case 3:
                    arr_req[3]=arr[i];
                    break;
                case 4:
                    arr_req[4]=arr[i];
                case 5:
                    arr_req[5]=arr[i];
                    break;
                case 6:
                    arr_req[6]=arr[i];
                    break;
                case 7:
                    arr_req[7]=arr[i];
                    break;
            }
        if(count==7){
                req=i;
                break;
            }
            }
            
        }
        System.out.println(req+1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int i=1;i<=t;i++){
		    int n=in.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]=in.nextInt();
		    }
		    solve(arr,n);
		}
	}
}