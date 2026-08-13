# CHEFLCM - Rating 1447

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef and Interview

Chef wants to hire a new assistant. He published an advertisement regarding that in a newspaper. After seeing the advertisement, many candidates have applied for the job. Now chef wants to shortlist people for the interviews, so he gave all of them one problem which they must solve in order to get shortlisted.

The problem was : For a given positive integer  **N**, what is the maximum sum of distinct numbers such that the Least Common Multiple of all these numbers is  **N**.

Your friend Rupsa also applied for the job, but was unable to solve this problem and hence you've decided to help her out by writing a code for solving this problem.

### Input

The first line of the input contains an integer  **T**  denoting the number of test cases.

Each test case contains a single integer  **N**.

### Output

For each test case, output a single line containing an integer corresponding to the answer for that test case.

### Constraints

- 1 ≤ T ≤ 1000
- 1 ≤ N ≤ 109

 **Subtask 1 (30 points):** 

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 105

 **Subtask 2 (70 points):** 

- original constraints

### Sample 1:
Input
Output

```
2
1
2
```

```
1
3
```

### Explanation:

 **Example 1 :**  Only possible number is  **1**, so the maximum sum of distinct numbers is exactly  **1**.
 **Example 2 :**  The distinct numbers you can have are just  **1**  and  **2**, so the sum is  **3**. If we consider any other number greater than  **2**, then the least common multiple will be more than  **2**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:22:57.663Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); 
            long sum = 0; 
            for (int p = 1; p * p <= n; p++) {
                if (n % p == 0) { 
                    sum += p; 
                    if (p != n / p) { 
                        sum += n / p;
                    }
                }
            }
            System.out.println(sum); 
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFLCM)