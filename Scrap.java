import java.util.Map;
import java.util.Scanner;

/**
 * Scrap
 */
public class Scrap {

    public void dups() {
        Scanner in = new Scanner(System.in);
        int a[] = new int[in.nextInt()];
        Map<int, int> freq = new Map<int, int>;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
    }
    public static void main(String[] args) {
        
    }
}