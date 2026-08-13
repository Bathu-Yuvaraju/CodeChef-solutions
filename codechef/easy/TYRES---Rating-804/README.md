# TYRES - Rating 804

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:38:45.585Z  

```java
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    String s=sc.next();
		    String n=sc.next();
		    String e="";
		    for(int j=0;j<5;j++)
		    {
		        if(s.charAt(j)==n.charAt(j))
		        {
		            e=e+"G";
		        }
		        else{
		            e=e+"B";
		        }
		    }
		    System.out.println(e);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TYRES)