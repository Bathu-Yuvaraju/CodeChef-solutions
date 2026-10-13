# NEGPROD - Rating 630

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Negative Product

Chef is given three numbers $A, B,$ and $C$.

He wants to find whether he can select  **exactly**  two numbers out of these such that the  **product**  of the selected numbers is negative.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of three integers $A, B,$ and $C$, the given numbers.
### Output Format

For each test case, output `YES` if Chef can select exactly two numbers out of these such that the product of the selected numbers is negative, `NO` otherwise.

You may print each character in uppercase or lowercase. For example, the strings `NO`, `no`, `No`, and `nO`, are all considered identical.

### Constraints
- $1 \leq T \leq 1000$
- $-10 \leq A, B, C \leq 10$
### Sample 1:
Input
Output

```
5
1 5 7
-5 0 4
6 -1 0
-3 -5 -2
0 0 -4

```

```
NO
YES
YES
NO
NO

```

### Explanation:

 **Test case $1$:**  There exists no way to select two numbers such that their product is negative.

 **Test case $2$:**  The product of $-5$ and $4$ is $-5\cdot 4 = -20$ which is negative.

 **Test case $3$:**  The product of $6$ and $-1$ is $6\cdot (-1) = -6$ which is negative.

 **Test case $4$:**  There exists no way to select two numbers such that their product is negative.

 **Test case $5$:**  There exists no way to select two numbers such that their product is negative.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T05:16:00.717Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if ((a < 0 || b < 0 || c < 0) && (a > 0 || b > 0 || c > 0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NEGPROD)