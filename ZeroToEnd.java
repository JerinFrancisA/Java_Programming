import java.util.Scanner;

public class ZeroToEnd {

    public static void zeroToEnd(Integer[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 ) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) 
            arr[count++] = 0; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        zeroToEnd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toString() + " ");            
        }
    }
}