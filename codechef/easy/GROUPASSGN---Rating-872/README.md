# GROUPASSGN - Rating 872

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T06:08:42.674Z  

```java

import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0){

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int P = sc.nextInt();
		int Q = sc.nextInt();
		
		int chef = X + (P * 10);
		int chefina = Y + (Q*10);
		
		if (chef < chefina){
		    System.out.println("Chef");
		}
		else if (chef == chefina){
		    System.out.println("Draw");
		}
		else{
		    System.out.println("Chefina");
		    
		}
		
		
		T--;
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GROUPASSGN)