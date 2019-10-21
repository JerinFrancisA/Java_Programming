/**
 * PCJAVAPROGRAMMING
 */
class ResourceManager {
    boolean valueSet = false;

    synchronized void printJava() {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("JAVA ");
        valueSet = true;
        notify();
    }

    synchronized void printProgramming() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = false;
        System.out.println("PROGRAMMING");
        notify();
    }
}

class PrintJava implements Runnable {
    ResourceManager r;

    PrintJava() {
    }

    PrintJava(ResourceManager r) {
        this.r = r;
        new Thread(this, "JAVA").start();
    }

    @Override
    public void run() {
        while (true) {
            r.printJava();
        }
    }
}

class PrintProgramming implements Runnable {
    ResourceManager r;

    PrintProgramming() {
    }

    PrintProgramming(ResourceManager r) {
        this.r = r;
        new Thread(this, "PROGRAMMING").start();
    }

    @Override
    public void run() {
        while (true) {
            r.printProgramming();
        }
    }
}

public class PCJAVAPROGRAMMING {

    public static void main(String[] args) {
        ResourceManager r = new ResourceManager();
        new PrintJava(r);
        new PrintProgramming(r);
    }
}