import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (x * x == 2 * y) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}