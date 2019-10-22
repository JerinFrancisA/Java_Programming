import java.util.ArrayList;
import java.util.Scanner;

/**
 * Prime
 */
public class Prime {

    public static boolean isPrime(int n) {
        if(n == 2) {return true;}
        ArrayList<Integer> factors = new ArrayList<Integer>();
        factors.add(1);
        for (int i = 2; i <=  n/2 +1; i++) {
            if(n%i == 0) {
                factors.add(i);
            }
        }
        factors.add(n);
        if(factors.size() == 2) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void printPrime(int n) {
        int count = 0;
        for (int i = 2;     ; i++) {
            if (isPrime(i)) {
                System.out.print(String.valueOf(i) + " ");
                count++;
            }
            if (count == n) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printPrime(in.nextInt());
        in.close();
    }
}