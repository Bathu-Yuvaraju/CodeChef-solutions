# MUSICHAIR - Rating 1374

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:19:31.096Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int n = scanner.nextInt(); 
            long ans = 0;
            ans += n; 
            ans += n;
            ans += (1L * n * (n - 1)) / 2; 
            System.out.println(ans); 
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MUSICHAIR)