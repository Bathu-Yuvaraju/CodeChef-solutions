import java.util.Scanner;

public class Main {

    public static void solve(Scanner sc) {
        int d = sc.nextInt();  
        int n = sc.nextInt(); 
        int ans = n;
        for (int i = 1; i <= d; i++) {
            ans = ans * (ans + 1) / 2;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();  
        while (test-- > 0) {
            solve(sc); 
        }
        sc.close();
    }
}
