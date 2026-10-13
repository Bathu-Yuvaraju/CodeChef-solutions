import java.util.Scanner;

public class Main {
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int gcdValue = gcd(a, b);
            long lcmValue = (long)a * b / gcdValue;
            
            System.out.println(gcdValue + " " + lcmValue);
        }
    }
}
