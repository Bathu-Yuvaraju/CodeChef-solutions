# STRNG - Rating 1829

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:34:01.099Z  

```java
import java.util.*;
class Codechef {
    static long gcd(long a, long b) 
    {
        while (b != 0) 
        {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long g = 0;
            for (int i = 0; i < N; i++) 
            {
                long x = sc.nextLong();
                g = gcd(g, x);
            }
            boolean possible = true;
            for (long i = 2; i * i <= g; i++)
            {
                if (g % i == 0) 
                {
                    if (i > K)
                    {
                        possible = false;
                        break;
                    }
                    while (g % i == 0)
                        g /= i;
                }
            }
            if (g > 1 && g > K)    possible = false;
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/STRNG)