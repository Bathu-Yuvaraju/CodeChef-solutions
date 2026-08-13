import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        
        while (t-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            if (100 - a < 200 - 2 * b) {
                System.out.println("First");
            } else if (100 - a > 200 - 2 * b) {
                System.out.println("Second");
            } else {
                System.out.println("Both");
            }
        }
    }
}
