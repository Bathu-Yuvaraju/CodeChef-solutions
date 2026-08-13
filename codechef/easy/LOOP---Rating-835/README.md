# LOOP - Rating 835

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:47:23.578Z  

```java


import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-->0) {
		    int ore= sc.nextInt();
		    int start = sc.nextInt();
		    int count =0;
		    while (start<ore) {
		        count++;
		        start = start + count;
		    }
		    System.out.println(count);
		}
		
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LOOP)