import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int ans = 0; 
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (i == 0) {
                    ans = a; 
                }
                ans = gcd(ans, a); 
            }
            if (ans != 1) {
                for (int j = 2; j * j <= ans; j++) {
                    if (ans % j == 0) {
                        ans = j; 
                        break;
                    }
                }
                System.out.println(ans);
            } else {
                System.out.println("-1");
            }
        }
    }
}
