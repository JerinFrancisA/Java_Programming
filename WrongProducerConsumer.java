
class Manager {
    int n;
    synchronized void put(int n) {
        this.n = n;
        System.out.println("put : " + n);
    }
    synchronized int get() {
        System.out.println("got : " + n);
        return n;
    }
}

class Producer implements Runnable {
    Manager m;

    Producer() {}
    Producer(Manager m) {
        this.m = m;
        new Thread(this, "P").start();
    }
    
    @Override
    public void run() {
        int i = 0;
            while(true) {
                m.put(i++);
            }
    }
}

class Consumer implements Runnable{
    Manager m;
    Consumer() {}
    Consumer(Manager m) {
        this.m = m;
        new Thread(this, "C").start();
    }
    
    @Override
    public void run() {
        while(true) {
            m.get();
        }
    }
}
public class WrongProducerConsumer {

    public static void main(String[] args) {
        Manager m = new Manager();
        new Producer(m);
        new Consumer(m);
    }
}