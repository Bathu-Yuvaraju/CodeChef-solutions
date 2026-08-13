import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int it = 0; it < t; it++) {
            solve(scanner); 
        }
        scanner.close();
    }

    static void solve(Scanner scanner) {
        int n = scanner.nextInt(); 
        int[] numbers = new int[n]; 

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt(); 
        }

        int g = gcd(numbers[0], numbers[1]); 
        for (int i = 2; i < n; i++) {
            g = gcd(g, numbers[i]); 
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] / g + " "); 
        }
        System.out.println(); 
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
