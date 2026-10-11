# DEVSPORTS - Rating 858

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T06:00:19.156Z  

```java
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
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int b = s.nextInt();
		int ar = l*b;
		int pr = 2*(l+b);
		if(ar>pr){
		System.out.println("Area");
		System.out.println(ar);
		}
		else if(pr>ar){
		System.out.println("Peri");
		System.out.println(pr);
		}
		else{
		System.out.println("Eq");
		System.out.println(ar);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DEVSPORTS)