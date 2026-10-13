# BALLBOX - Rating 978

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T05:17:50.252Z  

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
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a % 3 == 0 || b % 3 == 0) {
                System.out.println(0);
            } else if (a % 3 == b % 3) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        sc.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BALLBOX)