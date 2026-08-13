# MUSICHAIR - Rating 1494

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Musical Chairs

There are $N$ friends who decided to play the game of musical chairs one day.

Initially they decide a number $K$ and with each passing round they remove exactly $K$ chairs. Hence, in each round exactly $K$ players are eliminated. The game stops when less than or exactly $K$ players remain in the game.

Now, Chef wants to figure out for how many possible values of $K$ there will be exactly one winner in the game.

### Input Format
- The first line contains $T$ - the number of test cases. Then the test cases follow.
- The first line of each test case contain $N$ - the number of friends in the game.
### Output Format

For each test case, output in a single line a integer that denotes the number of values of $K$ for which there will be exactly one winner.

### Constraints
- $1 \leq T \leq 100$
- $2 \leq N \leq 10^9$
### Sample 1:
Input
Output

```
3
2
3
4

```

```
1
2
2

```

### Explanation:
- Test case $1$: There will be only one winner if the friends remove exactly $1$ chair each round.
- Test case $2$: There will be only one winner if the friends remove $1$ or $2$ chairs each round.
- Test case $3$: There will be only one winner if the friends remove $1$ or $3$ chairs each round. If they remove $2$ chairs then there will be two winners.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T09:20:44.337Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int tt = scanner.nextInt(); 
        while (tt-- > 0) {
            int n = scanner.nextInt();
            n--; 
            int ans = 0;

            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    ans++; 
                    if (i * i != n) {
                        ans++; 
                    }
                }
            }
            System.out.println(ans); 
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MUSICHAIR)