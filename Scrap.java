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
                freq.put(a[i], freq.get(a[i])+1);
            }
        }
        System.out.print("DUPLICATES : \nElement       Frequency\n");
        for (Map.Entry<Integer, Integer> var : freq.entrySet()) {
            if(var.getValue() > 1) {
                System.out.println(var.getKey() + "       :       " + var.getValue());
            }
        }
        in.close();
    }

    public static void zeroMover() {
        Scanner in = new Scanner(System.in);
        int a[] = new int[in.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        
        in.close();
    }
    public static void main(String[] args) {
        dups();
    }
}