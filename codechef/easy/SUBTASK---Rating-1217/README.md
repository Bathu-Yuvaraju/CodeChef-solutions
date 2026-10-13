# SUBTASK - Rating 1217

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### A Subtask Problem

Chef recently solved his first problem on CodeChef. The problem he solved has $N$ test cases. He gets a score for his submission according to the following rules:

- If Chef’s code passes all the $N$ test cases, he gets $100$ points.
- If Chef’s code does not pass all the test cases, but passes all the first $M\;(M \lt N)$ test cases, he gets $K\;(K \lt 100)$ points.
- If the conditions $1$ and $2$ are not satisfied, Chef does not get any points (i.e his score remains at $0$ points).

You are given a binary array $A_1, A_2, \dots, A_N$ of length $N$, where $A_i = 1$ denotes Chef's code passed the $i^{th}$ test case, $A_i = 0$ denotes otherwise. You are also given the two integers $M, K$. Can you find how many points does Chef get?

### Input Format
- First line will contain $T$, number of testcases. Then the testcases follow.
- The first line of each test case contains three space-separated integers $N, M, K$.
- The second line contains $N$ space-separated integer $A_1, A_2,\dots, A_N$.
### Output Format

For each testcase, output in a single line the score of Chef.

### Constraints
- $1 \leq T \leq 100$
- $2 \leq N \leq 100$
- $1 \leq M \lt N$
- $1 \leq K \lt 100$
- $0 \leq A_i \leq 1$
### Sample 1:
Input
Output

```
4
4 2 50
1 0 1 1
3 2 50
1 1 0
4 2 50
1 1 1 1
5 3 30
1 1 0 1 1

```

```
0
50
100
0

```

### Explanation:

 **Test case $1$** : Chef's code neither passes all $4$ test cases nor passes the first $2$ test cases. Hence he does not get any points.

 **Test case $2$** : Chef's code does not pass all $3$ test cases, but passes the first $2$ test cases. Hence he gets $50$ points.

 **Test case $3$** : Chef's code passes all the $4$ test cases. Hence he gets $100$ points.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T09:16:28.579Z  

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
		
		int t = sc.nextInt();
		
		while( t-- > 0 ){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int a [] = new int[n];
		    
		    for (int i = 0 ; i < n ; i++ ) {
		        a[i] = sc.nextInt();
		    }
		    
		    int count = 0;
		    for( int ele : a ){
		        if( ele == 1 ) count++;
		        else break;
		    }
		    
		    if( count == n ){
		        System.out.println( 100);
		    }
		    else if( count >= m  ){
		        System.out.println(k);
		    }
		    else{
		        System.out.println(0);
		    }
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SUBTASK)