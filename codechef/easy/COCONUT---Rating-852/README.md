# COCONUT - Rating 852

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Summer Heat
### Read problem statements in Vietnamese,

Chefland has $2$ different types of coconut, type $A$ and type $B$. Type $A$ contains only $x_a$ milliliters of coconut water and type $B$ contains only $x_b$ grams of coconut pulp. Chef's nutritionist has advised him to consume $X_a$ milliliters of coconut water and $X_b$ grams of coconut pulp every week in the summer. Find the total number of coconuts (type $A$ + type $B$) that Chef should buy each week to keep himself active in the hot weather.

### Input Format
- The first line contains an integer $T$, the number of test cases. Then the test cases follow.
- Each test case contains a single line of input, four integers $x_a$, $x_b$, $X_a$, $X_b$.
### Output Format

For each test case, output in a single line the answer to the problem.

### Constraints
- $1 \leq T \leq 15000$
- $100 \leq x_a \leq 200$
- $400 \leq x_b \leq 500$
- $1000 \leq X_a \leq 1200$
- $1000 \leq X_b \leq 1500$
- $x_a$ divides $X_a$.
- $x_b$ divides $X_b$.
### Subtasks

 **Subtask #1 (100 points):**  original constraints

### Sample 1:
Input
Output

```
3
100 400 1000 1200
100 450 1000 1350
150 400 1200 1200
```

```
13
13
11
```

### Explanation:

 **TestCase $1$:**  Number of coconuts of Type $A$ required = $\frac{1000}{100} = 10$ and number of coconuts of Type $B$ required = $\frac{1200}{400} = 3$. So the total number of coconuts required is $10 + 3 = 13$.

 **TestCase $2$:**  Number of coconuts of Type $A$ required = $\frac{1000}{100} = 10$ and number of coconuts of Type $B$ required = $\frac{1350}{450} = 3$. So the total number of coconuts required is $10 + 3 = 13$.

 **TestCase $3$:**  Number of coconuts of Type $A$ required = $\frac{1200}{150} = 8$ and number of coconuts of Type $B$ required = $\frac{1200}{400} = 3$. So the total number of coconuts required is $8 + 3 = 11$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T05:59:39.625Z  

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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    System.out.println((c/a)+(d/b));
		}

	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/COCONUT)