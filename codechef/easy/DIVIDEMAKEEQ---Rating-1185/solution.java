import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int g = a[0];  
            for (int x : a) {
                g = gcd(x, g);  
            }

            int count = 0;
            for (int x : a) {
                if (x == g) {
                    count++;
                }
            }

            System.out.println(n - count);  
        }
        sc.close();
    }
}
