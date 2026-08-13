class Solution {
    public String checkOddPairs(int A, int B, int C) {
        if ((A + B) % 2 == 1 || (A + C) % 2 == 1 || (B + C) % 2 == 1) {
            return "yes";
        } else {
            return "no";
        }
    }
}
