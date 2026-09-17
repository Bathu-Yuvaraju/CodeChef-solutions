# CSTOCK - Rating 1069

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef and Stock Prices

Chef wants to buy a stock whose price was $S$ rupees when the market opened. He will buy the stock if and only if its price is in the range $[A, B]$. The price of the stock has changed by $C\%$ by the time he was trying to buy the stock. Will he be able to buy the stock?

### Input Format
- First line of the input contains $T$, the number of testcases. Then the test cases follow.
- Each test case contains $4$ space-separated integers $S, A, B, C$ in a single line.
### Output Format

For each test case, if Chef buys the stock print `YES`, otherwise print `NO`.

You may print each character of the string in uppercase or lowercase (for example, the strings `yEs`, `yes`, `Yes`, and `YES` will all be treated as identical).

### Constraints
- $1 \leq T \leq 1000$
- $0 \leq S \leq 10^6$
- $0 \leq A \leq B \leq 10^6$
- $-100 \leq C \leq 100$
### Sample 1:
Input
Output

```
3
100 93 108 7
100 94 100 -7
183 152 172 -17
```

```
Yes
No
No
```

### Explanation:
- Test Case $1$: The price of the stock after gaining $7\%$ will become $107$, which is in Chef's range of $[93, 108]$. Hence, Chef will buy the stock.
- Test Case $2$: The price of the stock after falling $7\%$ will become $93$, which is not in Chef's range of $[94, 100]$. Hence, Chef will not buy the stock.
- Test Case $3$: The price of the stock after falling $17\%$ will become $151.89$, which is not in Chef's range of $[152, 172]$. Hence, Chef will not buy the stock.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T05:20:12.417Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {   
            int s=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            s=s*(c+100)/100;
            
            if(s>=a && s<=b)
            System.out.println("yes");
            else
            System.out.println("no");
        }
		
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CSTOCK)