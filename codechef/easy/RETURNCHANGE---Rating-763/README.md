# RETURNCHANGE - Rating 763

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Return the Change

In Chefland, denominations less than rupees $10$ have stopped and now rupees $10$ is the smallest denomination.

Suppose Chef goes to buy some item with cost  **not**  a multiple of $10$, then, he will be charged the cost that is the  **nearest multiple**  of $10$.
If the cost is equally distant from two nearest multiples of $10$, then the cost is  **rounded up**.

For example, $35, 38, 40, 44$ are all rounded to $40$.

Chef purchased an item having cost $X$ $(X \leq 100)$ and gave a bill of rupees $100$. How much amount will he get back?

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of a single integer $X$, the cost of the item.
### Output Format

For each test case, output the amount returned to Chef.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq X \leq 100$
### Sample 1:
Input
Output

```
4
35
54
80
12

```

```
60
50
20
90

```

### Explanation:

 **Test case $1$:**  The cost of the item is rounded up to $40$. Thus, Chef gets back $100-40 = 60$ rupees.

 **Test case $2$:**  The cost of the item is rounded down to $50$. Thus, Chef gets back $100-50 = 50$ rupees.

 **Test case $3$:**  The cost of the item is $80$. Thus, Chef gets back $100-80 = 20$ rupees.

 **Test case $4$:**  The cost of the item is rounded down to $10$. Thus, Chef gets back $100-10 = 90$ rupees.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:09:25.294Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int x = scanner.nextInt(); 
            if ((x % 10) >= 5) {
                x += (10 - (x % 10));
            } else {
                x -= (x % 10); 
            }
            System.out.println(100 - x);
        }
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/RETURNCHANGE)