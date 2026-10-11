# INCREAR - Rating 852

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Equal Integers

Chef has two integers $X$ and $Y$. Chef wants to perform some operations to make $X$ and $Y$ equal. In one operation, Chef can either:

- set $X := X + 1$
- or set $Y := Y + 2$

Find the minimum number of operations required to make $X$ and $Y$ equal.

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first and only line of each test case contains two space separated integers $X$ and $Y$.
### Output Format

For each test case, print the minimum number of operations required to make $X$ and $Y$ equal.

### Constraints
- $1 \leq T \leq 10^4$
- $1 \leq X, Y \leq 10^9$
### Sample 1:
Input
Output

```
5
3 4
5 5
7 3
5 2
7 12

```

```
1
0
2
3
5

```

### Explanation:

Let $(x, y)$ denote the values of $X$ and $Y$ respectively.

 **Test case $1$:**  Only one operation is required: $(3, 4) \xrightarrow{X := X + 1}{} (4, 4)$

 **Test case $2$:**  No operations are required since $X$ and $Y$ are already equal.

 **Test case $3$:**  Two operations are required: $(7, 3) \xrightarrow{Y := Y + 2}{} (7, 5) \xrightarrow{Y := Y + 2}{} (7, 7)$

 **Test case $4$:**  Three operations are required. One such sequence of operations is: $(5, 2) \xrightarrow{Y := Y + 2}{} (5, 4) \xrightarrow{X := X + 1}{} (6, 4) \xrightarrow{Y := Y + 2}{} (6, 6)$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T05:59:12.936Z  

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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(x>y){
		        if((x-y) % 2 == 0){
		            System.out.println((x-y)/2);
		        }else{
		            System.out.println(((x-y)/2) + (((x-y)%2) + 1));
		        }
		        
		    }else{
		        System.out.println((y-x));
		    }
		}

	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/INCREAR)