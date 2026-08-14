# VDATES - Rating 878

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T05:49:05.070Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int sub,a,b,c,div;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0; i<t; i++ )
		{  
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		sub = b-a;
		div = sub/c;
		
	    System.out.println(div);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/VDATES)