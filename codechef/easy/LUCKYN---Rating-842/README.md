# LUCKYN - Rating 842

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:08:48.836Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int x = scanner.nextInt(); 
            int y = scanner.nextInt(); 
            int z = scanner.nextInt(); 
            System.out.println((x + y + z >= 6) ? "Yes" : "No");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LUCKYN)