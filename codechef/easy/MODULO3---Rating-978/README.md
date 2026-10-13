# MODULO3 - Rating 978

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Divisible by 3

Stack likes the number $3$ a lot.

He has two non-negative integers $A$ and $B$.
In one operation, Stack can do either of the following:

- $A:=|A-B|$ (change $A$ to $|A-B|$)
- $B:=|A-B|$ (change $B$ to $|A-B|$)

Note that $|X|$ denotes absolute value of $X$. For example $|-7| = 7$ and $|4| = 4$.

Find the  **minimum**  number of operations after which  **at least**  one integer out of $A$ and $B$ becomes divisible by $3$.

### Input Format
- The first line of input contains a single integer $T$, denoting the number of test cases. The description of $T$ test cases follows.
- The only line of each test case contains two integers $A$ and $B$.
### Output Format

For each test case, output in a single line the  **minimum**  number of operations after which  **at least**  one integer out of $A$ and $B$ becomes divisible by $3$.

### Constraints
- $1 \leq T \leq 10^5$
- $0 \leq A, B \leq 10^9$
### Sample 1:
Input
Output

```
2
0 343
1 1

```

```
0
1

```

### Explanation:

 **Test case $1$:**  $A=0$ is already divisible by $3$.

 **Test case $2$:**  In the only operation, Stack can change $A=1$ to $A = |A-B| = |1-1| = 0$. Now $A=0$ is divisible by $3$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T05:17:48.401Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a % 3 == 0 || b % 3 == 0) {
                System.out.println(0);
            } else if (a % 3 == b % 3) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        sc.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MODULO3)