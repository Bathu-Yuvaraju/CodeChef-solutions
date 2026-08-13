import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int x = scanner.nextInt(); 
            if ((x % 10) >= 5) {
                x += (10 - (x % 10));
            } else {
                x -= (x % 10); 
            }
            System.out.println(100 - x);
        }
    }
}

