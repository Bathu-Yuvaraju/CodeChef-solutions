# VACCINQ - Rating 1016

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef in Vaccination Queue

There are $N$ people in the vaccination queue, Chef is standing on the $P^{th}$ position from the front of the queue. It takes $X$ minutes to vaccinate a child and $Y$ minutes to vaccinate an elderly person. Assume Chef is an elderly person.

You are given a binary array $A_1, A_2, \dots, A_N$ of length $N$, where $A_i = 1$ denotes there is an elderly person standing on the $i^{th}$ position of the queue, $A_i = 0$ denotes there is a child standing on the $i^{th}$ position of the queue. You are also given the three integers $P, X, Y$. Find the number of minutes after which Chef's vaccination will be completed.

### Input Format
- First line will contain $T$, number of testcases. Then the testcases follow.
- The first line of each test case contains four space-separated integers $N, P, X, Y$.
- The second line of each test case contains $N$ space-separated integer $A_1, A_2,\dots, A_N$.
### Output Format

For each testcase, output in a single line the number of minutes after which Chef's vaccination will be completed.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 100$
- $1 \leq P \leq N$
- $1 \leq X, Y \leq 10$
- $0 \leq A_i \leq 1$
- $A_P = 1$
### Sample 1:
Input
Output

```
3
4 2 3 2
0 1 0 1
3 1 2 3
1 0 1
3 3 2 2
1 1 1

```

```
5
3
6

```

### Explanation:

 **Test case $1$** : The person standing at the front of the queue is a child and the next person is Chef. So it takes a total of $3 + 2 = 5$ minutes to complete Chef's vaccination.

 **Test case $2$** : Chef is standing at the front of the queue. So his vaccination is completed after $3$ minutes.

 **Test case $3$** : Chef is standing at the rear of the queue. So it takes a total of $2 + 2 + 2 = 6$ minutes to complete Chef's vaccination.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T09:13:35.718Z  

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
		    int a , b , c , d , min;
		    min =0;
		    a = sc.nextInt();
		    b = sc.nextInt();
		    c = sc.nextInt();
		    d = sc.nextInt();
		    int[] arr = new int[a];
		    for(int i =0;i<a;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    for(int i =0;i<b ;i++){
		        if(arr[i]==0){
		            min+=c;
		        }
		        else
		        min+=d;
		            
		       
		        
		    }
		    System.out.println(min);
		    
		}

	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/VACCINQ)