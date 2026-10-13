import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int total = n * x;
            if (total >= 10000 && total <= 99999) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
