import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerFact {

    public static void factorial(int n) {
        BigInteger big = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        System.out.println(big);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        factorial(n);
        in.close();
    }
}