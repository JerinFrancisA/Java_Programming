import java.util.*;
import java.util.Scanner;

/**
 * Scrap
 */
public class Scrap {

    public static void dups() {
        Scanner in = new Scanner(System.in);
        int a[] = new int[in.nextInt()];
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            if(freq.get(a[i]) == null) {
                freq.put(a[i], 1);
            }
            else {
                freq.put(a[i], a[i]+1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " : " + freq.get(a[i]));
        }
        in.close();
    }
    public static void main(String[] args) {
        dups();
    }
}