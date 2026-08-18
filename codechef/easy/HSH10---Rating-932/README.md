# HSH10 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T05:36:33.400Z  

```java
import java.util.Scanner;

public class Main {
    static final int M = 999983;
    static final int MX = 1000000000;

    static int[] Hash = new int[M];

    // Hash Function
    static int f(int x) {
        return x % M;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Write your code here
         long ans = 0; 
        for (int i = 0; i < n; i++) {
            if (a[i] > -31623 && a[i] < 31623) {
                ans += Hash[f(a[i] * a[i])];
            }
            Hash[f(a[i])]++;
        }

        System.out.println(ans);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/HSH10)