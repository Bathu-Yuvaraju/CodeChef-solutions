# EFMGDV25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Counting Boolean Values in ArrayList
- You have an ArrayList of Boolean objects. Your task is to count how many true values are present in the ArrayList.
- Complete countTrueValues method by iterating through the ArrayList and increment a counter for each true value you encounter.
- Then complete the call to countTrueValues. Complete the code to achieve this functionality.

 **Output format:** 

```
Number of true values: 3

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T15:00:38.425Z  

```java
import java.util.ArrayList;

class BooleanCounter {

    public static int countTrueValues(ArrayList<Boolean> list) {
        int count = 0;
        for (Boolean b : list) {
            if (b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Boolean> booleanList = new ArrayList<>();
        // Autoboxing as we are storing primitive boolean values to a list of Boolean objects
        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(true);
        booleanList.add(true);
        booleanList.add(false);

        // Call countTrueValues method on booleanList 
        int trueCount = countTrueValues(booleanList);
        System.out.println("Number of true values: " + trueCount);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV25)