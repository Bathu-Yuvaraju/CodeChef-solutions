import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            mainSolve(scanner);
        }
        scanner.close();
    }
    public static void mainSolve(Scanner scanner) {
        int x = scanner.nextInt(); 
        int ans = (x + 24) / 25;    
        System.out.println(ans);    
    }
}
