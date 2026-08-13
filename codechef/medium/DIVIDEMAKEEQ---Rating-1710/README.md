# DIVIDEMAKEEQ - Rating 1710

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:29:11.093Z  

```java
import java.util.*;

class Codechef {
    static final long MOD = 1000000007;
    static final long INF = 1000000000000000000L;
    static final int MAX_SIZE = 1000001;
    static void sieve(boolean[] isPrime, int[] smallestPrimeFactor) {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; 
        for (int i = 2; i < MAX_SIZE; i++) {
            if (isPrime[i]) {
                smallestPrimeFactor[i] = i; 
                for (int j = i * 2; j < MAX_SIZE; j += i) {
                    isPrime[j] = false; 
                    if (smallestPrimeFactor[j] == 0) {
                        smallestPrimeFactor[j] = i; 
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        boolean[] isPrime = new boolean[MAX_SIZE];
        int[] smallestPrimeFactor = new int[MAX_SIZE];
        sieve(isPrime, smallestPrimeFactor); 

        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int n = scanner.nextInt();
            Map<Integer, Integer> cnt = new HashMap<>(); 
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt(); 
                while (x > 1) {
                    cnt.put(smallestPrimeFactor[x], cnt.getOrDefault(smallestPrimeFactor[x], 0) + 1); 
                    x /= smallestPrimeFactor[x]; 
                }
            }

            long ans = 1; 
            for (int value : cnt.values()) {
                ans = (ans * (value + 1)) % MOD;
            }
            System.out.println(ans);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DIVIDEMAKEEQ)