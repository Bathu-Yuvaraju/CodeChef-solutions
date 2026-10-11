# CONN - Rating 860

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Construct N

You are given an integer $N$. Find if it is possible to represent $N$ as the sum of several(possibly zero) $2$'s and several(possibly zero) $7$'s.

Formally, find if there exist two integers $X, Y \ (X, Y \ge 0)$ such that $2 \cdot X + 7\cdot Y = N$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of a single line containing an integer $N$.
### Output Format

For each test case, print on a new line `YES` if it is possible to represent $N$ as the sum of several(possibly zero) $2$'s and several(possibly zero) $7$'s and `NO` otherwise.

You may print each character of the string in either uppercase or lowercase (for example, the strings `yEs`, `yes`, `Yes`, and `YES` will all be treated as identical).

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 10^8$
### Sample 1:
Input
Output

```
4
2
5
7
11

```

```
YES
NO
YES
YES

```

### Explanation:

 **Test case $1$:**  $2 \cdot 1 + 7\cdot 0 = 2$.

 **Test case $2$:**  It is impossible to express $5$ as a sum of several $2$'s and $7$'s.

 **Test case $3$:**  $2 \cdot 0 + 7\cdot 1 = 7$.

 **Test case $4$:**  $2 \cdot 2 + 7\cdot 1 = 11$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T06:03:15.218Z  

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
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    if(n%2==0 || n%7==0){
		        System.out.println("YES");
		    }
		    else if(n%2!=0 && n>7){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CONN)