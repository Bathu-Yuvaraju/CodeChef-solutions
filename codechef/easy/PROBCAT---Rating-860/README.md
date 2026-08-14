# PROBCAT - Rating 860

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Problem Category

Chef prepared a problem. The admin has rated this problem for $x$ points.

A problem is called :

- Easy if $1 \leq x \lt 100$
- Medium if $100 \leq x \lt 200$
- Hard if $200 \leq x \leq 300$

Find the category to which Chef’s problem belongs.

### Input Format
- The first line contains $T$ denoting the number of test cases. Then the test cases follow.
- The first and only line of each test case contains a single integer $x$.
### Output Format

For each test case, output in a single line the category of Chef's problem, i.e whether it is an `Easy`, `Medium` or `Hard` problem.  **The output is case sensitive.** 

### Constraints
- $1 \leq T \leq 50$
- $1 \leq x \leq 300$
### Subtasks
- Subtask 1 (100 points): Original constraints
### Sample 1:
Input
Output

```
3
50
172
201

```

```
Easy
Medium
Hard

```

### Explanation:

 **Test case $1$** : The problem with rating $x = 50$ is an easy problem as $1 \leq 50 \lt 100$.

 **Test case $2$** : The problem with rating $x = 172$ is a medium problem as $100 \leq 172 \lt 200$.

 **Test case $3$** : The problem with rating $x = 201$ is a hard problem as $200 \leq 201 \leq 300$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T05:55:10.939Z  

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
		while(t-->0){
		     int x =sc.nextInt();
		
			if(x>=1&&x<100)
		    System.out.println("Easy");
		    else if(x>=100&&x<200)
		     System.out.println("Medium");
		     else
		     System.out.println("Hard");
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PROBCAT)