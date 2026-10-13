# TWOVSTEN - Rating 936

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T05:17:15.224Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int gcd(int a, int b) {
        if (b == 0) 
            return a;
        return gcd(b, a % b);
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int gcd = gcd(N, M);
            int count = (N * M) / (gcd * gcd);
            System.out.println(count);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TWOVSTEN)