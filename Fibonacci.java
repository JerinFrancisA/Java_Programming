import java.util.Scanner;

public class Fibonacci {

    public static void name(int n) {
        int a0 = 0, a1 = 1, a3;
        if(n == 0) {
            System.out.print("");
            return;
        }
        else if(n == 1) {
            System.out.print("0");
            return;
        }
        else if(n == 2) {
            System.out.print("0 1");
            return;
        }
        System.out.print("0 1 ");
        while(--n >= 2) {
            a3 = a0 + a1;
            a0 = a1;
            a1 = a3;
            System.out.print(String.valueOf(a3) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        name(in.nextInt());
        in.close();
    }
}