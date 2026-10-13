# IPCCERT - Rating 1016

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T09:13:37.620Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a , b , c , d , min;
		    min =0;
		    a = sc.nextInt();
		    b = sc.nextInt();
		    c = sc.nextInt();
		    d = sc.nextInt();
		    int[] arr = new int[a];
		    for(int i =0;i<a;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    for(int i =0;i<b ;i++){
		        if(arr[i]==0){
		            min+=c;
		        }
		        else
		        min+=d;
		            
		       
		        
		    }
		    System.out.println(min);
		    
		}

	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/IPCCERT)