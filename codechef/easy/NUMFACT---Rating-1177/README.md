# NUMFACT - Rating 1177

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:26:50.093Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void solve(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = Integer.MAX_VALUE;
        int ans1 = -1, ans2 = -1;

        for (int i = a; i <= Math.min(b, a + 3); i++) {
            for (int j = i + 1; j <= Math.min(b, a + 3); j++) {
                if (gcd(i, j) > 1) {
                    if (i + j < sum) {
                        sum = i + j;
                        ans1 = i;
                        ans2 = j;
                    }
                }
            }
        }

        if (ans1 == -1) {
            System.out.println(-1);
        } else {
            System.out.println(ans1 + " " + ans2);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t--> 0) {
            solve(br);
        }
    }

}
```

---

[View on CodeChef](https://www.codechef.com/problems/NUMFACT)