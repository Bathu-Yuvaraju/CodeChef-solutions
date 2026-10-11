# SUMM - Rating 308

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Sum it

Bob received an assignment from his school: he has two numbers $A$ and $B$, and he has to find the sum of these two numbers.
Alice, being a good friend of Bob, told him that the answer to this question is $C$.
Bob doesn't completely trust Alice and asked you to tell him if the answer given by Alice is correct or not.
If the answer is correct print `"YES"`, otherwise print `"NO"` (without quotes).

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line of each test case consists of three space-separated integers $A, B,$ and $C$.
### Output Format

For each test case, output on a new line the answer: `YES` if Alice gave the right answer, and `NO` otherwise.

Each character of the output may be printed in either uppercase or lowercase, i.e, the outputs `Yes`, `YES`, `yEs` and `yes` will be treated as equivalent.

### Constraints
- $1 \leq T \leq 100$
- $0 \leq A, B, C \leq 100$
### Sample 1:
Input
Output

```
3
1 2 3
4 5 9
2 3 6
```

```
YES
YES
NO
```

### Explanation:

 **Test case $1$:**  $1+2 = 3$, so Alice's answer is correct.

 **Test case $2$:**  $4+5 = 9$, so Alice's answer is correct.

 **Test case $3$:**  $2+3=5$ which doesn't equal $6$, so Alice's answer is incorrect.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T06:19:57.299Z  

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
        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println((a + b == c) ? "Yes" : "No");
        }

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SUMM)