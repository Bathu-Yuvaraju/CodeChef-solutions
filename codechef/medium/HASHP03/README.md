# HASHP03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T05:41:04.576Z  

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            if (!groups.containsKey(sortedS)) {
                groups.put(sortedS, new ArrayList<>());
            }
            groups.get(sortedS).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HASHP03)