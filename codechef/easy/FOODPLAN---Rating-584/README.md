# FOODPLAN - Rating 584

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:07:53.842Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        
        while (t-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            if (100 - a < 200 - 2 * b) {
                System.out.println("First");
            } else if (100 - a > 200 - 2 * b) {
                System.out.println("Second");
            } else {
                System.out.println("Both");
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FOODPLAN)