# SMOL - Rating 1306

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Smallest Possible Whole Number

You are given two integers $N$ and $K$. You may perform the following operation any number of times (including zero): change $N$ to $N-K$, i.e. subtract $K$ from $N$. Find the smallest non-negative integer value of $N$ you can obtain this way.

### Input
- The first line of the input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.
- The first and only line of each test case contains two space-separated integers $N$ and $K$.
### Output

For each test case, print a single line containing one integer — the smallest value you can get.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq N \leq 10^9$
- $0 \leq K \leq 10^9$
### Subtasks

 **Subtask #1 (100 points):**  original constraints

### Sample 1:
Input
Output

```
3
5 2
4 4
2 5
```

```
1
0
2
```

### Explanation:

 **Example case 1:** 

- First, we change $N = 5$ to $N - K = 5 - 2 = 3$.
- Then, we have $N = 3$ and we change it to $N - K = 3 - 2 = 1$.

Since $1 \lt K$, the process stops here and the smallest value is $1$.

 **Example case 2:**  We change $N = 4$ to $N - K = 4 - 4 = 0$. Since $0 \lt K$, the process stops here and the smallest value is $0$.

 **Example case 3:**  Since $2 \lt K$ initially, we should not perform any operations and the smallest value is $2$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T06:00:39.229Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		int n=sc.nextInt();
		int k=sc.nextInt();
		if(k==0)
		System.out.println(n);
		else
		System.out.println(n%k);}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SMOL)