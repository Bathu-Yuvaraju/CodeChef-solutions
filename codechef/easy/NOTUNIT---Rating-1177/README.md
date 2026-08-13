# NOTUNIT - Rating 1177

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Dazzling GCD Pair

Dazzler has a task for you.

Given two  **positive**  integers $A$ and $B$, find two  **positive**  integers $i$ and $j$ such that:

- gcd$(i,j) \gt 1$;
- $A \leq i \lt j \leq B$;
- The value $(i + j)$ is minimum possible.

If there are multiple solutions, you may print any of them. If no such pair exists, print $-1$.

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- Each test case contains of a single line of input, two integers $A$ and $B$.
### Output Format

For each test case, output in a single line two space-separated integers $i$ and $j$ satisfying all the conditions. If no such pair exists, print $-1$.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq A \lt B \leq 10^9$
### Sample 1:
Input
Output

```
2
2 3
2 10

```

```
-1
2 4

```

### Explanation:

 **Test case $1$:**  There exists no pair satisfying all the conditions.

 **Test case $2$:**  A valid pair satisfying all the conditions is $(i, j) = (2, 4)$. The value $\texttt{gcd}(2, 4) = 2 >1$. The value $(i+j) = 6$.
It can be proven that no such pair exists that satisfies all the conditions and has sum less than $6$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:26:47.680Z  

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

[View on CodeChef](https://www.codechef.com/problems/NOTUNIT)