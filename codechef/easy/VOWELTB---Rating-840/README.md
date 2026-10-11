# VOWELTB - Rating 840

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Is it a VOWEL or CONSONANT

Write a program to take a character $(C)$ as input and check whether the given character is a vowel or a consonant.

$NOTE:-$ Vowels are 'A', 'E', 'I', 'O', 'U'. Rest all alphabets are called consonants.

### Input Format
- First line will contain the character $C$.
### Output Format

Print "Vowel" if the given character is a vowel, otherwise print "Consonant".

### Constraints
- $C$ $will$ $be$ $an$ $upper$ $case$ $English$ $alphabet$
### Sample 1:
Input
Output

```
Z

```

```
Consonant
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T05:58:30.127Z  

```java
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ref=new Scanner(System.in);
		char c=ref.next().charAt(0);
		
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
		    System.out.println("Vowel");
		}
		else{
		    System.out.println("Consonant");
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/VOWELTB)