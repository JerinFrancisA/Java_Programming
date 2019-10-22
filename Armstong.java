import java.util.Scanner;
import java.lang.Math;

/**
 * Armstong
 */
public class Armstong {
    public static void isArmstrong(int n) {
        int len = String.valueOf(n).length();
        String num = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))), len);
        }
        if(sum == n){System.out.println("YES");}else{System.out.println("NO");};
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        isArmstrong(in.nextInt());
        in.close();
    }
}