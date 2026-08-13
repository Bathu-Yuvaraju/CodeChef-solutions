import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int k = scanner.nextInt(); 
            System.out.println((n / k) * (n / k));
        }
    }
}
