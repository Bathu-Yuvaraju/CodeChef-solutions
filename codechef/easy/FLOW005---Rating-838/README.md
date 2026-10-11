# FLOW005 - Rating 838

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Grade The Steel

A certain type of steel is graded according to the following conditions.

- Hardness of the steel must be greater than 50
- Carbon content of the steel must be less than 0.7
- Tensile strength must be greater than 5600

The grades awarded are as follows:

- Grade is 10 if all three conditions are met
- Grade is 9 if conditions (1) and (2) are met
- Grade is 8 if conditions (2) and (3) are met
- Grade is 7 if conditions (1) and (3) are met
- Grade is 6 if only one condition is met
- Grade is 5 if none of the three conditions are met

Write a program to display the grade of the steel, based on the values of hardness, carbon content and tensile strength of the steel, given by the user.

### Input Format

The first line contains an integer  **T**, total number of testcases. Then follow  **T**  lines, each line contains three numbers  **hardness**,  **carbon content**  and  **tensile strength**  of the steel.

### Output Format

For each test case, print Grade of the steel depending on Conditions, in a new line.

### Constraints
- 1 ≤ T ≤ 1000
- 0 ≤ hardness, carbon content, tensile strength ≤ 10000
### Sample 1:
Input
Output

```
3 
53 0.6 5602
45 0 4500
0 0 0 

```

```
10
6
6

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T05:57:13.132Z  

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
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0){
		    float h=sc.nextFloat();
		    float c=sc.nextFloat();
		    float ts=sc.nextFloat();
		    if(h>50 && c<0.7 && ts>5600){
	        System.out.println("10");
	    }
	   else if(h>50 && c<0.7){
	     System.out.println("9");
	    }
	    else if( c<0.7 && ts>5600){
	       System.out.println("8");  
	    }
	    else if(h>50  && ts>5600){
	     System.out.println("7");   
	    }
	    else if(h>50|| c<0.7 || ts>5600){
	        System.out.println("6");
	    }
	    else{
	        System.out.println("5");
	    }
		    
		    
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW005)