# SUMNEQ - Rating 577

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T05:15:20.225Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int c = scanner.nextInt();
            if (a % 2 == c % 2) {
                System.out.println((a + c) / 2);
            } else {
                System.out.println(-1);
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SUMNEQ)