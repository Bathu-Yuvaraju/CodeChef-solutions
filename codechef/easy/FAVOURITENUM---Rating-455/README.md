# FAVOURITENUM - Rating 455

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T05:13:57.895Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int sum = 0;
            while (n != 0) {
                int d = n % 10;
                sum += d;
                n /= 10;
            }
            System.out.println(sum);
        }
        scanner.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FAVOURITENUM)