# NOTUNIT - Rating 1272

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:25:52.093Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int testcase = scanner.nextInt(); 
        for (int t = 0; t < testcase; t++) {
            int x = scanner.nextInt(); 
            int y = scanner.nextInt(); 
            int ans = 0;
            
            if (x % 2 == 1) {
                ans = 1;
                for (int i = 2; i <= x; i++) {
                    if (x % i == 0) { 
                        x += i;
                        break;
                    }
                }
            }
            System.out.println(ans + (y - x + 1) / 2);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NOTUNIT)