/**
 * CorrectProducerConsumer
 */
class Q {
    int n;
    boolean valueSet;

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("put : " + n);
        notify();
    }

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = false;
        System.out.println("get : " + n);
        notify();
        return n;
    }
}

class Pro implements Runnable {
    Q q;

    Pro() {
    }

    Pro(Q q) {
        this.q = q;
        new Thread(this, "PRODUCER").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consu implements Runnable {
    Q q;

    Consu() {
    }

    Consu(Q q) {
        this.q = q;
        new Thread(this, "CONSUMER").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class CorrectProducerConsumer {

    public static void main(String[] args) {
        Q q = new Q();
        new Pro(q);
        new Consu(q);
    }
}