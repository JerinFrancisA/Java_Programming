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
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int c = 0, j = 0;
        for (int var : a) {
            if(var == 0) {
                c++;
            } else {
                b[j++] = var;
            }
        }
        for(int i = a.length-c; i<a.length; i++) {
            b[i] = 0;
        }
        a = b;
        for (int var : a) {
            System.out.println(var);
        }
        in.close();
    }

    public static void fact() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = in.nextInt(), dup1 = n, dup2 = n, f1 = 1, f2 = 1;
        while(dup1 >= 1) {
            f1 *= dup1--;
        }
        System.out.println("Fact using while : " + f1);
        for(int i = 2; i <= dup2; i++) {
            f2 *= i;
        }
        System.out.println("Fact using for : " + f2);
        in.close();
    }

    public static void fibo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = in.nextInt(), f1 = 0, f2 = 1, f3 = 0;
        f3 = f3 + 0;
        if(n > 2) {
            System.out.print("0 1 ");
            while(n-- > 2) {
                f3 = f1 + f2;
                System.out.print(f3 + " ");
                f1 = f2;
                f2 = f3;
            }
        }
        else {
            if(n==0 || n==1) System.out.println("0");
            if(n==2) System.out.println("0 1");
        }
        in.close();
    }

    public static void First50Prime() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = in.nextInt();

        in.close();
    }
    public static void main(String[] args) {
        // dups();
        // zeroMover();
        // fact();
        fibo();
    }
}