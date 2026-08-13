# BOOKPAGES - Rating 506

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:08:26.834Z  

```java
class Solution {
    public String checkOddPairs(int A, int B, int C) {
        if ((A + B) % 2 == 1 || (A + C) % 2 == 1 || (B + C) % 2 == 1) {
            return "yes";
        } else {
            return "no";
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BOOKPAGES)