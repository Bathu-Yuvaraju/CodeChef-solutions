import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T!=0) {
            int R = sc.nextInt();

            if (R >= 2000){
                System.out.println(1);
            }
            else if ((R < 2000) && (R >= 1600)){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }


            T--;
        }
        }
    }