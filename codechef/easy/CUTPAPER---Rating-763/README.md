# CUTPAPER - Rating 763

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:09:27.840Z  

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
            int x = scanner.nextInt(); 
            if ((x % 10) >= 5) {
                x += (10 - (x % 10));
            } else {
                x -= (x % 10); 
            }
            System.out.println(100 - x);
        }
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/CUTPAPER)