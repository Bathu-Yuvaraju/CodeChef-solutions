# DEVSPORTS - Rating 859

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Devendra and Water Sports

Recently, Devendra went to Goa with his friends. Devendra is well known for not following a budget.

He had Rs. $Z$ at the start of the trip and has already spent Rs. $Y$ on the trip. There are three kinds of water sports one can enjoy, with prices Rs. $A$, $B$, and $C$. He wants to try each sport at least once.

If he can try all of them at least once output `YES`, otherwise output `NO`.

### Input Format
- The first line of input contains a single integer $T$, denoting the number of test cases. The description of $T$ test cases follows.
- Each test case consists of a single line of input containing five space-separated integers $Z, Y, A, B, C$.
### Output Format

For each test case, print a single line containing the answer to that test case — `YES` if Devendra can try each ride at least once, and `NO` otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

### Constraints
- $1\leq T\leq 10$
- $10^4 \leq Z \leq 10^5$
- $0 \leq Y \leq Z$
- $100 \leq A,B,C \leq 5000$
### Sample 1:
Input
Output

```
3
25000 22000 1000 1500 700
10000 7000 100 300 500
15000 5000 2000 5000 3000
```

```
NO
YES
YES
```

### Explanation:

 **Test Case 1:**  After spending Rs. $22000$ on the trip already, Devendra is left with Rs. $3000$. The water sports cost a total of $1000+1500+700 = 3200$. So, he does not have enough money left to try all the watersports.

 **Test Case 2:**  After spending Rs. $10000$ on the trip, he is left with Rs. $3000$. The water sports cost a total of $100+300+500 = 900$. So, he has enough money to try all the watersports.

 **Test Case 3:**  After spending Rs. $5000$ on the trip, he is left with Rs. $10000$. The water sports cost a total of $2000+5000+3000 = 10000$. So, he still has enough money left to try all the watersports.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T06:01:07.891Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t, z, y, a, b, c;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0){
		    z=sc.nextInt();
		    y=sc.nextInt();
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    
		    if((z-y)>=a+b+c){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DEVSPORTS)