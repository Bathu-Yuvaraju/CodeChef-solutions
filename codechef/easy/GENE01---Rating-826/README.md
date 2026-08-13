# GENE01 - Rating 826

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Genes

People in Chefland have three different eye colors, namely `brown`, `blue`, and `green`.  **`green` is the rarest of the eye colors whereas `brown` is most common.** 

The eye color of the child of two people is  **most likely**  to be the  **most common**  eye color between them.

You are given two characters denoting the eye colors of two people in Chefland. The character `R` denotes `bRown` color, `B` denotes `Blue` color, and `G` denotes `Green` color.

Determine the  **most likely**  eye color of their child. (Print `R`, `B` or `G` denoting `bRown`, `Blue` or `Green` respectively).

Please see the sample test cases below for explained examples.

### Input Format
- The first (and only) line of input contains two space-separated characters, the eye colors of the parents.
### Output Format

Print a single character denoting the most likely eye color of the child. (Print `R`, `B` or `G` denoting `brown`, `blue` or `green` respectively).

### Constraints
- The input contains two space-separated characters
- Each character in the input is one among {R, B, G}.
### Subtasks
### Sample 1:
Input
Output

```
R B

```

```
R
```

### Explanation:

The two people have brown and blue eyes and brown is the most common. Therefore, their child will most likely have brown eyes.

### Sample 2:
Input
Output

```
B B

```

```
B
```

### Explanation:

Both parents have blue eyes, therefore their child will most likely have blue eyes

### Sample 3:
Input
Output

```
G B

```

```
B
```

### Explanation:

The parents have green and blue eyes, out of which blue is more common than green, therefore the child will most likely have blue eyes.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:44:06.941Z  

```java


import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		
		if(a==b){
		    System.out.println(a);
		}else if(a=='R' || b=='R'){
		    System.out.println('R');
		}else if(a=='B' || b=='B'){
		    System.out.println('B');
		}else{
		    System.out.println('G');
		}
		
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GENE01)