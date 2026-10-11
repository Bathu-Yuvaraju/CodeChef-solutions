# FLOW005 - Rating 839

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Smallest Numbers of Notes

Consider a currency system in which there are notes of six denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.
If the sum of Rs.  **N**  is input, write a program to compute smallest number of notes that will combine to give Rs.  **N**.

### Input

The first line contains an integer  **T**, total number of testcases. Then follow  **T**  lines, each line contains an integer  **N**.

### Output

For each test case, display the smallest number of notes that will combine to give  **N**, in a new line.

### Constraints
- 1 ≤ T ≤ 1000
- 1 ≤ N ≤ 1000000
### Sample 1:
Input
Output

```
3 
1200
500
242
```

```
12
5
7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T05:57:50.460Z  

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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++){
		    int p=sc.nextInt();
		    int sum=0;
		    int a[]={100,50,10,5,2,1};
		    int n[]=new int[6];
		    for(int j=0;j<6;j++){
		    n[j]=p/a[j];
		    sum+=n[j];
		    p=p%a[j];
		    }
		  //  for(int j=0;j<6;j++)
		    if(sum!=0)
		    System.out.println(sum);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW005)