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
