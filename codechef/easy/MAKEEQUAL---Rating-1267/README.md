# MAKEEQUAL - Rating 1267

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Make them equal

Chef has an array $A$ having $N$ elements. Chef wants to make all the elements of the array equal by repeating the following move.

- Choose any integer $K$ between $1$ and $N$ (inclusive). Then choose $K$ distinct indices $i_1, i_2, \dots, i_K$, and increase the values of $A_{i_1}, A_{i_2}, \dots, A_{i_K}$ by $1$.

Find the minimum number of moves required to make all the elements of the array equal.

### Input Format
- The first line contains $T$ denoting the number of test cases. Then the test cases follow.
- The first line of each test case contains a single integer $N$ denoting the number of elements in $A$.
- The second line of each test case contains $N$ space separated integers $A_1, A_2, \dots, A_N$.
### Output Format

For each test case, print a single line containing one integer denoting the minimum number of moves required to make all the elements of the array equal.

### Constraints
- $1 \leq T \leq 10^4$
- $1 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^5$
- The sum of $N$ over all test cases does not exceed $10^5$.
### Sample 1:
Input
Output

```
2
3
1 3 1
3
2 2 2
```

```
2
0
```

### Explanation:
- Test Case $1$: In the first move, Chef can choose $K = 2$, and choose the indices $\{1, 3\}$. After increasing $A_1$ and $A_3$ by $1$, the array will become $[2, 3, 2]$. In the second move, Chef can choose $K = 2$, and choose the indices $\{1, 3\}$. After increasing $A_1$ and $A_3$ by $1$, the array will become $[3, 3, 3]$, and hence all the elements become equal.
- Test Case $2$: All the elements of the array are equal, hence no move is required.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T09:14:45.102Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i< N; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i< N; i++) {
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }
            System.out.println(max - min);
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MAKEEQUAL)