# FOURTICKETS - Rating 300

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T06:19:21.744Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x < y) {
                System.out.println("Profit");
            } else if (x > y) {
                System.out.println("Loss");
            } else {
                System.out.println("Neutral");
            }
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FOURTICKETS)