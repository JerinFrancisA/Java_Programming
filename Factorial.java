import java.util.*;

public class Factorial {
    
    public static void findFactorial(int n ) {
        int f = 1;
        while(n > 0) {
            f *= n--;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        findFactorial(scan.nextInt());
    }
    
}