# BULLBEAR - Rating 300

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T06:19:13.708Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		   if ((x>y||x>z)&&(x<y||x<z))
              System.out.println(x);
          else if ((y>x||y>z)&&(y<x||y<z))
             System.out.println(y); 
           else
               System.out.println(z);
           
          
		}

	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BULLBEAR)