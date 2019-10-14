import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int var : arr) {
            Integer a = freq.get(var);
            System.out.println(a);
            if (a == null) {
                freq.put(var, 1);
            }
            else {
                freq.put(var, a + 1);
            }
        }
        System.out.println(freq);
        scan.close();
    }
}