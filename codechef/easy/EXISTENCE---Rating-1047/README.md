# EXISTENCE - Rating 1047

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Cutting Recipes

The chef has a recipe he wishes to use for his guests, but the recipe will make far more food than he can serve to the guests. The chef therefore would like to make a reduced version of the recipe which has the same ratios of ingredients, but makes less food. The chef, however, does not like fractions. The original recipe contains only whole numbers of ingredients, and the chef wants the reduced recipe to only contain whole numbers of ingredients as well. Help the chef determine how much of each ingredient to use in order to make as little food as possible.

### Input

Input will begin with an integer T, the number of test cases. Each test case consists of a single line. The line begins with a positive integer N, the number of ingredients. N integers follow, each indicating the quantity of a particular ingredient that is used.

### Output

For each test case, output exactly N space-separated integers on a line, giving the quantity of each ingredient that the chef should use in order to make as little food as possible.

### Constraints

T ≤ 100
2 ≤ N ≤ 50
All ingredient quantities are between 1 and 1000, inclusive.

### Sample 1:
Input
Output

```
3
2 4 4
3 2 3 4
4 3 15 9 6
```

```
1 1
2 3 4
1 5 3 2
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:14:43.179Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int it = 0; it < t; it++) {
            solve(scanner); 
        }
        scanner.close();
    }

    static void solve(Scanner scanner) {
        int n = scanner.nextInt(); 
        int[] numbers = new int[n]; 

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt(); 
        }

        int g = gcd(numbers[0], numbers[1]); 
        for (int i = 2; i < n; i++) {
            g = gcd(g, numbers[i]); 
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] / g + " "); 
        }
        System.out.println(); 
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EXISTENCE)