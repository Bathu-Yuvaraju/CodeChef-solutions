# FLOW006 - Rating 430

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T05:13:40.890Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            // Your code goes here
            if (a != b && b != c && a != c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
        }
    }


```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW006)