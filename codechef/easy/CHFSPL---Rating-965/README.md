# CHFSPL - Rating 965

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef and Spells

Chef has three spells. Their powers are $A$, $B$, and $C$ respectively. Initially, Chef has $0$ hit points, and if he uses a spell with power $P$, then his number of hit points increases by $P$.

Before going to sleep, Chef wants to use exactly two spells out of these three. Find the maximum number of hit points Chef can have after using the spells.

### Input Format
- The first line of the input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.
- The first and only line of each test case contains three space-separated integers $A$, $B$, and $C$.
### Output Format

For each test case, print a single line containing one integer — the maximum number of hit points.

### Constraints
- $1 \leq T \leq 10^4$
- $1 \leq A, B, C \leq 10^8$
### Subtasks

 **Subtask #1 (100 points):**  original constraints

### Sample 1:
Input
Output

```
2
4 2 8
10 14 18
```

```
12
32
```

### Explanation:

 **Example case 1:**  Chef has three possible options:

- Use the first and second spell and have $4 + 2 = 6$ hitpoints.
- Use the second and third spell and have $2 + 8 = 10$ hitpoints.
- Use the first and third spell and have $4 + 8 = 12$ hitpoints.

Chef should choose the third option and use the spells with power $4$ and $8$ to have $12$ hitpoints.

 **Example case 2:**  Chef should use the spells with power $14$ and $18$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T05:56:07.082Z  

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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int a1 = sc.nextInt();
		    int b1 = sc.nextInt();
		    int a2 = sc.nextInt();
		    int b2 = sc.nextInt();
		    if((a==a1 || a==b1) && (b==a1 || b==b1)){
		        System.out.println(1);
		    }
		    else if((a==a2 || a==b2) && (b==a2 || b==b2)){
		        System.out.println(2);
		    }
		    else{
		        System.out.println(0);
		    }
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CHFSPL)