/**
 * W5Q1
 */
class Thread1 extends Thread {
    static boolean isPrime(int n) {
        if (n == 2)
            return true;
        for (int i = 2; i <= n / 2 + 1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public void run() {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i))
                System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 12 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }
    }
}

public class W5Q1 {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}