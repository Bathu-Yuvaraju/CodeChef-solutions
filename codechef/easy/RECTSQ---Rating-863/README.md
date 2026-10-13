# RECTSQ - Rating 863

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T05:17:01.229Z  

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
        
        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if ((B - A) % 3 <= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RECTSQ)