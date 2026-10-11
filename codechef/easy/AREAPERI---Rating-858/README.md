# AREAPERI - Rating 858

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Area OR Perimeter

Write a program to obtain length $(L)$ and breadth $(B)$ of a rectangle and check whether its area is greater or perimeter is greater or both are equal.

### Input Format
- First line will contain the length $(L)$ of the rectangle.
- Second line will contain the breadth $(B)$ of the rectangle.
### Output Format

Output 2 lines.

In the first line print "Area" if area is greater otherwise print "Peri" and if they are equal print "Eq".(Without quotes).

In the second line print the calculated area or perimeter (whichever is greater or anyone if it is equal).

### Constraints
- $1 \leq L \leq 1000$
- $1 \leq B \leq 1000$
### Sample 1:
Input
Output

```
1
2

```

```
Peri
6

```

### Explanation:

Area = 1 * 2 = 2
Peri = 2 * (1 + 2) = 6
Since Perimeter is greater than Area, hence the output is :
Peri
6

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T06:00:17.328Z  

```java
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int b = s.nextInt();
		int ar = l*b;
		int pr = 2*(l+b);
		if(ar>pr){
		System.out.println("Area");
		System.out.println(ar);
		}
		else if(pr>ar){
		System.out.println("Peri");
		System.out.println(pr);
		}
		else{
		System.out.println("Eq");
		System.out.println(ar);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/AREAPERI)