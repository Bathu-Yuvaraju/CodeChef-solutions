# TWOVSTEN - Rating 936

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Two vs Ten

Chef Two and Chef Ten are playing a game with a number $X$. In one turn, they can multiply $X$ by $2$. The goal of the game is to make $X$ divisible by $10$.

Help the Chefs find the smallest number of turns necessary to win the game (it may be possible to win in zero turns) or determine that it is impossible.

### Input
- The first line of the input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.
- The first and only line of each test case contains a single integer denoting the initial value of $X$.
### Output

For each test case, print a single line containing one integer — the minimum required number of turns or $-1$ if there is no way to win the game.

### Constraints
- $1 \le T \le 1000$
- $0 \le X \le 10^9$
### Subtasks

 **Subtask #1 (100 points):**  original constraints

### Sample 1:
Input
Output

```
3
10
25
1
```

```
0
1
-1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T05:17:23.841Z  

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
            int x = sc.nextInt();
            if (x % 10 == 0) {
                System.out.println(0);
            } else if (x % 5 == 0) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }

	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TWOVSTEN)