# NUMFACT - Rating 1710

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Number of Factors

Alice has learnt factorization recently. Bob doesn't think she has learnt it properly and hence he has decided to quiz her. Bob gives Alice a very large number and asks her to find out the number of factors of that number. To make it a little easier for her, he represents the number as a product of  **N**  numbers. Alice is frightened of big numbers and hence is asking you for help. Your task is simple. Given  **N**  numbers, you need to tell the number of distinct factors of the product of these  **N**  numbers.

### Input:
First line of input contains a single integer  **T**, the number of test cases.
Each test starts with a line containing a single integer  **N**.
The next line consists of  **N**  space separated integers (**Ai**).

### Output:
For each test case, output on a separate line the total number of factors of the product of given numbers.

### Constraints:

```
1 ≤ T ≤ 100
1 ≤ N ≤ 10
2 ≤ Ai ≤ 1000000

```

### Scoring:
You will be awarded  **40**  points for correctly solving for  **Ai**  ≤ 100.
You will be awarded another  **30**  points for correctly solving for  **Ai**  ≤ 10000.
The remaining  **30**  points will be awarded for correctly solving for  **Ai**  ≤ 1000000.

### Sample 1:
Input
Output

```
3
3
3 5 7
3
2 4 6
2
5 5
```

```
8
10
3
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:29:08.370Z  

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

[View on CodeChef](https://www.codechef.com/problems/NUMFACT)