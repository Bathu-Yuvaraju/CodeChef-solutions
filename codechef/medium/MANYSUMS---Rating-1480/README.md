# MANYSUMS - Rating 1480

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Distinct Pair Sums

You are given a range of integers $\{L, L+1, \ldots, R\}$. An integer $X$ is said to be  *reachable*  if it can be represented as a sum of two  **not necessarily distinct**  integers in this range. Find the number of distinct reachable integers.

### Input
- The first line of the input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.
- The first and only line of each test case contains two space-separated integers $L$ and $R$.
### Output

For each test case, print a single line containing one integer — the number of reachable integers.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq L \leq R \leq 10^6$
### Sample 1:
Input
Output

```
2
2 2
2 3
```

```
1
3
```

### Explanation:

 **Example case 1:**  The only reachable integer is $2 + 2 = 4$.

 **Example case 2:**  $4$, $5$ and $6$ are reachable, since $2+2=4$, $2+3=5$ and $3+3=6$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T05:23:37.586Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (isr);
		int t=Integer.parseInt(br.readLine());
		while(t!=0)
		{
		    String input = br.readLine();
		    String i[]=input.split(" ");
		    int l=Integer.parseInt(i[0]),
		        r=Integer.parseInt(i[1]);
		    int ans = r*2 - l*2 + 1;
            System.out.println(ans);
		    t--;
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MANYSUMS)