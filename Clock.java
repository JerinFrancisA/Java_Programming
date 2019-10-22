class TSec implements Runnable {
    int s = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                s = (s + 1) % 60;
                System.out.println("s : " + s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TMin implements Runnable {
    int m = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(60000);
                m = (m + 1) % 60;
                System.out.println("m : " + m);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class THour implements Runnable {
    int h;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3600000);
                h = (h + 1) % 24;
                System.out.println("s : " + h);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * Clock
 */
public class Clock {

    public static void main(String[] args) {
        Thread s = new Thread(new TSec());
        Thread m = new Thread(new TMin());
        Thread h = new Thread(new THour());
        h.start();
        m.start();
        s.start();
    }
}