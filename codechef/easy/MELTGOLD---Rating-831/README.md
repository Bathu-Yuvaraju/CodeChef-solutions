# MELTGOLD - Rating 831

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:46:33.583Z  

```java


import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0){
    	    double n=sc.nextInt();
    	    double x= sc.nextInt();
    	    double y=sc.nextInt();
    	    double a=sc.nextInt();
    	    double b= sc.nextInt();
    	    
    	    double p = (n/a)*x;
    	    double d= (n/b)*y;
    	    
    	    if(p>d){
    	        System.out.println("DIESEL");
    	    }else if (p<d){
    	        System.out.println("PETROL");
    	    }else{
    	        System.out.println("ANY");
    	    } 
    	    
    	    
    	}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MELTGOLD)