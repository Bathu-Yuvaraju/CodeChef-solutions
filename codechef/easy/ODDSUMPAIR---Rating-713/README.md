# ODDSUMPAIR - Rating 713

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:08:09.840Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int t = Integer.parseInt(scanner.nextLine()); 
        while (t-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            int n = Integer.parseInt(input[0]); 
            int m = Integer.parseInt(input[1]); 

            int x = 9 * n; 
            int y = 10 * m; 

            if (x < y) {
                System.out.println("ONLINE");
            } else if (x > y) {
                System.out.println("DINING");
            } else {
                System.out.println("EITHER");
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ODDSUMPAIR)