import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int m = scanner.nextInt(); 
            System.out.println(gcd(n, m)); 
        }
        scanner.close();
    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b); 
    }
}