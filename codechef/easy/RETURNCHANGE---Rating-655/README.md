# RETURNCHANGE - Rating 655

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Lucky Numbers

Chef calls a number  *lucky*  if it contains the digit $7$ at least once.

Given a number $X$, determine if it is a  *lucky*  number or not.

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first and only line of each test case contains an integer $X$ — the number mentioned in the problem statement.
### Output Format

For each test case, output `YES` if $X$ is a lucky number. Otherwise, output `NO`.

You may print each character of `YES` and `NO` in uppercase or lowercase (for example, `yes`, `yEs`, `Yes` will be considered identical).

### Constraints
- $1 \leq T \leq 1000$
- $1 \le X \le 10^9$
### Sample 1:
Input
Output

```
4
6
478
2090
77777

```

```
NO
YES
NO
YES

```

### Explanation:

 **Test Case 1:**  The number $6$ is not lucky since it does not contain the digit $7$.

 **Test Case 2:**  The number $478$ is lucky since it contains the digit $7$ at least once.

 **Test Case 3:**  The number $2090$ is not lucky since it does not contain the digit $7$.

 **Test Case 4:**  The number $77777$ is lucky since it contains the digit $7$ at least once.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:09:10.887Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            String ans = "No";
            while (x > 0) {
                int d = x % 10;
                
                if (d == 7) {
                    ans = "Yes";
                    break;  
                }
                x /= 10;
            }
            System.out.println(ans);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RETURNCHANGE)