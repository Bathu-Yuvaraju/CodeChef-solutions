# PALL01 - Rating 830

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### The Block Game

 

The citizens of Byteland regularly play a game. They have blocks each denoting some integer from 0 to 9. These are arranged together in a random manner without seeing to form different numbers keeping in mind that the first block is never a 0. Once they form a number they read in the reverse order to check if the number and its reverse is the same. If both are same then the player wins. We call such numbers  *palindrome*.

Ash happens to see this game and wants to simulate the same in the computer. As the first step he wants to take an input from the user and check if the number is a palindrome and declare if the user wins or not. 

### Input

The first line of the input contains T, the number of test cases. This is followed by T lines containing an integer N.

### Output

For each input output "wins" if the number is a palindrome and "loses" if not, in a new line.

### Constraints

1<=T<=20
1<=N<=20000

### Sample 1:
Input
Output

```
3
331
666
343
```

```
loses
wins
wins
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:45:45.493Z  

```java
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner tb = new Scanner(System.in);
	  int T = tb.nextInt();
	  
	  for(int i = 1;i <= T;i++)
	  {
	      int N = tb.nextInt();
	      int temp,r,sum =0;
	      temp = N;    
          while(N > 0)
          {    
          r = N % 10;  
          sum = (sum * 10) + r;    
          N = N / 10;    
          }    
          if(temp == sum)    
          System.out.println("wins");    
          else    
          System.out.println("loses");    
	  }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PALL01)