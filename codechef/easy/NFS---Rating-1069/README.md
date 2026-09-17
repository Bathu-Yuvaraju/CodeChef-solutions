# NFS - Rating 1069

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T05:20:18.271Z  

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

[View on CodeChef](https://www.codechef.com/problems/NFS)