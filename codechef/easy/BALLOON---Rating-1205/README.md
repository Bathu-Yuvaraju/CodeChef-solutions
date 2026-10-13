# BALLOON - Rating 1205

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### ICPC Balloons

Chef is participating in an ICPC regional contest, in which there is a total of $N$ problems (numbered $1$ through $N$) with varying difficulties. For each valid $i$, the $i$-th easiest problem is problem $A_i$.

After a team solves a problem, a balloon with a colour representing that problem is tied next to their desk. Chef is fond of colours in  **VIBGYOR**, which are representative of the problems with numbers $1$ through $7$. The remaining problems have their own representative colours too.

Find the minimum number of problems which Chef's team needs to solve in order to get all the balloons for problems $1$ through $7$ (and possibly some other balloons too) tied next to their desk, if you know that Chef's team knows the difficulties of all problems and solves the problems in increasing order of difficulty.

### Input
- The first line of the input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.
- The first line of each test case contains a single integer $N$.
- The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$.
### Output

For each test case, print a single line containing one integer ― the minimum number of problems Chef's team needs to solve.

### Constraints
- $1 \leq T \leq 10,500$
- $7 \leq N \leq 15$
- $1 \leq A_i \leq N$ for each valid $i$
- $A_1, A_2, \ldots, A_N$ are pairwise distinct
### Sample 1:
Input
Output

```
3
7
1 2 3 4 5 7 6
8
8 7 6 5 4 3 2 1
9
7 4 3 5 6 1 8 2 9
```

```
7
8
8
```

### Explanation:

 **Example case 1:**  Since there are a total of $7$ problems, Chef's team will have to solve all of them.

 **Example case 2:**  Problems $1$ through $7$ appear among the first $8$ problems.

 **Example case 3:**  Problems $1$ through $7$ again appear among the first $8$ problems.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T09:17:23.852Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void solve(int arr[],int n){
        int count=0;
        int req=0;
        int arr_req[]=new int[8];
        for(int i=0;i<n;i++){
            if(arr[i]==1 || arr[i]==2 || arr[i]==3 || arr[i]==4 || arr[i]==5  || arr[i]==6 || arr[i]==7 ){
                count++;
            switch(arr[i]){
                case 1:
                    arr_req[1]=arr[i];
                    break;
                case 2:
                    arr_req[2]=arr[i];
                    break;
                case 3:
                    arr_req[3]=arr[i];
                    break;
                case 4:
                    arr_req[4]=arr[i];
                case 5:
                    arr_req[5]=arr[i];
                    break;
                case 6:
                    arr_req[6]=arr[i];
                    break;
                case 7:
                    arr_req[7]=arr[i];
                    break;
            }
        if(count==7){
                req=i;
                break;
            }
            }
            
        }
        System.out.println(req+1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int i=1;i<=t;i++){
		    int n=in.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]=in.nextInt();
		    }
		    solve(arr,n);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BALLOON)