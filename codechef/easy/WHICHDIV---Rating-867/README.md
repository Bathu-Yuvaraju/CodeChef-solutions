# WHICHDIV - Rating 867

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Which Division

Given the rating $R$ of a person, tell which division he belongs to. The rating range for each division are given below:

- Division $1$: $2000 \le$ Rating.
- Division $2$: $1600 \le$ Rating $\lt 2000$.
- Division $3$: Rating $\lt 1600$.
### Input Format
- The first line of the input contains $T$ - the number of test cases. Then the test cases follow.
- Each testcase contains a single line of input, which contains a single integer $R$.
### Output Format

For each test case, output on a single line the answer: $1$ if the person belongs to Division $1$, $2$ if the person belongs to Division $2$, and $3$ if the person belongs to Division $3$.

### Constraints
- $1 \leq T \leq 1000$
- $1000 \leq R \leq 4500$
### Sample 1:
Input
Output

```
3
1500
4000
1900
```

```
3
1
2

```

### Explanation:

 **Test case $1$:**  Since the rating of the person lies in the range $[1000, 1600)$, he belongs to Division $3$.

 **Test case $2$:**  Since the rating of the person lies in the range $[2000, 4500]$, he belongs to Division $1$.

 **Test case $3$:**  Since the rating of the person lies in the range $[1600, 2000)$, he belongs to Division $2$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T06:04:46.769Z  

```java
import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T!=0) {
            int R = sc.nextInt();

            if (R >= 2000){
                System.out.println(1);
            }
            else if ((R < 2000) && (R >= 1600)){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }


            T--;
        }
        }
    }
```

---

[View on CodeChef](https://www.codechef.com/problems/WHICHDIV)