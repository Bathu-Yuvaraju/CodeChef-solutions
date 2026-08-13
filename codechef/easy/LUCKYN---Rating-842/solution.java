import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int x = scanner.nextInt(); 
            int y = scanner.nextInt(); 
            int z = scanner.nextInt(); 
            System.out.println((x + y + z >= 6) ? "Yes" : "No");
        }
    }
}
