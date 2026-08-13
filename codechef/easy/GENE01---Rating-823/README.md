# GENE01 - Rating 823

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:43:05.587Z  

```java


import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
	  Scanner sc =new Scanner(System.in);
	  t=sc.nextInt();
	  while(t-->0){
	   int m=sc.nextInt();
	   int n=sc.nextInt();
	   int k=sc.nextInt();
	    if((n*k)<m){
	       System.out.println("Yes");
	    }
	    else{
	        
	      System.out.println("No");  
	    }
	  }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GENE01)