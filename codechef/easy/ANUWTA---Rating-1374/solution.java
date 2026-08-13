import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int n = scanner.nextInt(); 
            long ans = 0;
            ans += n; 
            ans += n;
            ans += (1L * n * (n - 1)) / 2; 
            System.out.println(ans); 
        }
    }
}
