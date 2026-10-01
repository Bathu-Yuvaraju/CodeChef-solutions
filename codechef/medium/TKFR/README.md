# TKFR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Top K Frequent Numbers

Chef has an array $A$ of $N$ integers. He wants to find the $K$  **distinct numbers that occur most frequently**.

A number with a higher frequency comes first. If two numbers have the same frequency, the  **larger number comes first**.

Print the first $K$ numbers in this order.

### Input Format
- The first line contains an integer $N$, the length of the array.
- The second line contains $N$ space-separated integers integers $A_1,A_2,\ldots,A_N$.
- The third line contains an integer $K$.
### Output Format

Print $K$ distinct numbers in the required order, separated by spaces.

### Constraints
- $1 \le N \le 25$
- $1 \le A_i \le 100$
- $1 \le K \le 4$
- $K$ does not exceed the number of distinct values in $A$.
### Sample 1:
Input
Output

```
6
1 1 1 2 2 3
2
```

```
1 2
```

### Explanation:

The frequencies of $1$, $2$, and $3$ are $3$, $2$, and $1$, respectively. The two most frequent numbers are $1$ and $2$.

### Sample 2:
Input
Output

```
8
1 1 2 2 3 3 3 4
2
```

```
3 2
```

### Explanation:

Number $3$ occurs three times. Numbers $1$ and $2$ each occur twice, so $2$ comes first because it is larger. The answer is $3\ 2$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T05:22:48.947Z  

```java
import java.io.*;
import java.util.*;
public class Main {
    static final BufferedInputStream in=new BufferedInputStream(System.in);
    static String next() throws IOException {
        int c;do{c=in.read();}while(c!=-1 && c<=32);
        StringBuilder s=new StringBuilder();
        while(c>32 && c!=-1){s.append((char)c);c=in.read();}
        return s.toString();
    }
    static int nextInt() throws IOException{return Integer.parseInt(next());}
    public static void main(String[] args) throws Exception {
        int n=nextInt();int[] f=new int[101];
        for(int i=0;i<n;++i)++f[nextInt()];
        int k=nextInt();List<Integer> vals=new ArrayList<>();
        for(int x=1;x<=100;++x)if(f[x]>0)vals.add(x);
        vals.sort((a,b)->f[a]!=f[b]?Integer.compare(f[b],f[a]):Integer.compare(b,a));
        StringBuilder out=new StringBuilder();
        for(int i=0;i<k;++i){if(i>0)out.append(' ');out.append(vals.get(i));}
        System.out.println(out);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TKFR)