# LOOP - Rating 838

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Circular Track

There is a circular track of length $M$ consisting of $M$ checkpoints and $M$  **bidirectional**  roads such that each road has a length of $1$ unit.

Chef is currently at checkpoint $A$ and wants to reach checkpoint $B$. Find the  **minimum**  length of the road he needs to travel.

### Input Format
- First line will contain $T$, the number of test cases. Then the test cases follow.
- Each test case contains a single line of input, three integers $A, B,$ and $M$ - the initial checkpoint, the final checkpoint, and the total number of checkpoints respectively.
### Output Format

For each test case, output the  **minimum**  length Chef needs to travel.

### Constraints
- $1 \leq T \leq 1000$
- $2 \leq M \leq 10^9$
- $1 \leq A, B \leq M$
- $A \neq B$
### Sample 1:
Input
Output

```
4
1 3 100
1 98 100
40 30 50
2 1 2

```

```
2
3
10
1

```

### Explanation:

 **Test Case $1$:**  Chef can go from $1$ to $3$ as: $1 \rightarrow 2$ and then $2 \rightarrow 3$. Thus, total length travelled is $2$ units.

 **Test Case $2$:**  Chef can go from $1$ to $98$ as: $98 \leftarrow 99 \leftarrow 100 \leftarrow 1$. Thus, minimum distance travelled is $3$ units.

 **Test Case $3$:**  Chef can go from $40$ to $30$ as: $30 \leftarrow 31 \leftarrow 32 \leftarrow \dots \leftarrow 39 \leftarrow 40$. Thus, minimum distance travelled is $10$ units.

 **Test Case $4$:**  Chef can go from $2$ to $1$ as: $1 \leftarrow 2$. Thus, minimum distance travelled is $1$ unit.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T10:14:25.349Z  

```java


import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int A = sc.nextInt();
		    int B = sc.nextInt(); 
		    int M = sc.nextInt(); 
		    
		    int Val1 = Math.abs(B-A);
		    int Val2 = Math.abs(M-Val1);
		    System.out.println(Math.min(Val1, Val2));
		}
		sc.close();
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LOOP)