import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if ((a < 0 || b < 0 || c < 0) && (a > 0 || b > 0 || c > 0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
