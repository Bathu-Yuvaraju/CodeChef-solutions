import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); 
            long sum = 0; 
            for (int p = 1; p * p <= n; p++) {
                if (n % p == 0) { 
                    sum += p; 
                    if (p != n / p) { 
                        sum += n / p;
                    }
                }
            }
            System.out.println(sum); 
        }
    }
}