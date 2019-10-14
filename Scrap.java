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

    public static boolean isArmstrong() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = in.nextInt(), noOfDigits = 0, num = n, digit = 0, arms = 0;
        noOfDigits = noOfDigits+ 0; // Please ignore this stmt. This was aaded to remove warning in VS Code
        digit = digit + 0; // Please ignore this stmt. This was aaded to remove warning in VS Code
        arms = arms + 0; // Please ignore this stmt. This was aaded to remove warning in VS Code
        while(num != 0) {
            digit = num % 10;
            num = num / 10;
            noOfDigits++;
        }
        num = n;
        while(num != 0) {
            digit = num % 10;
            arms += Math.pow(digit, noOfDigits);
            num = num / 10;
        }    
        in.close();
        return arms == n;
    }

    public static void stringDemo() {
        String str = new String("    Jerin Francis   ");
        System.out.println("original str : " + str);
        System.out.println("str.length() : " + str.length());
        str = str.trim();
        System.out.println("str.trim() : " + str.trim());
        System.out.println("length after str.trim() : " + str.length());
        str = str.replace("Jerin", "Merin");
        System.out.println("str.replace() : " + str);
        System.out.println("str.contains() : " + str.contains("Merin"));
        System.out.println("str.equals() : " + str.equals("Merin Francis"));
    }

    public static void stringBufferDemo() {
        StringBuffer str = new StringBuffer("Jerin ");
        System.out.println("original str : " + str);
        str.append("Merin");
        System.out.println("str.append() : " + str);
        str = str.insert(5, "w");
        System.out.println("str.insert() : " + str);
        str = str.replace(0, str.length(), "nireM nireJ");
        System.out.println("str.replace() : " + str);
        str = str.reverse();
        System.out.println("str.reverse() : " + str);
        System.out.println("str.substring() : " + str.substring(6, str.length()));
    }
    public static void main(String[] args) {
        // dups();
        // zeroMover();
        // fact();
        // fibo();
        // System.out.println(isArmstrong());
        stringDemo();
    }
}