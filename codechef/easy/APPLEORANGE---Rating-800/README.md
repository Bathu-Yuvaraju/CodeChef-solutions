# APPLEORANGE - Rating 800

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:09:49.835Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int k = scanner.nextInt(); 
            System.out.println((n / k) * (n / k));
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/APPLEORANGE)