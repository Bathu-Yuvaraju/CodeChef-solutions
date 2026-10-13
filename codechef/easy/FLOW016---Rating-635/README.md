# FLOW016 - Rating 635

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### GCD and LCM

Two integers  **A**  and  **B**  are the inputs. Write a program to find GCD and LCM of A and B.

### Input Format

The first line contains an integer  **T**, total number of testcases. Then follow  **T**  lines, each line contains an integer  **A**  and  **B**.

### Output Format

Display the GCD and LCM of  **A**  and  **B**  separated by space respectively. The answer for each test case must be displayed in a new line.

### Constraints

1  **≤**   **T**   **≤**  1000 1  **≤**   **A,B**   **≤**  1000000

### Sample 1:
Input
Output

```
3 
120 140
10213 312
10 30
```

```
20 840
1 3186456
10 30

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T05:16:10.531Z  

```java
import java.util.Scanner;

public class Main {
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int gcdValue = gcd(a, b);
            long lcmValue = (long)a * b / gcdValue;
            
            System.out.println(gcdValue + " " + lcmValue);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW016)