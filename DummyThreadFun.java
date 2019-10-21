/**
 * DummyThreadFun
 */
/**
 * InnerDummyThreadFun
 */
class ThreadFun extends Thread {
    @Override
    public void run() {
        System.out.println("name : " + this.getName());
        System.out.println("id : " + this.getId());
        System.out.println("priority : " + this.getPriority());
        System.out.println("state : " + this.getState());
        System.out.println("this : " + this);
        System.out.println("isAlive : " + this.isAlive());
        this.setName("junk");
        System.out.println("name : " + this.getName());
        System.out.println("currentThread : " + Thread.currentThread());
    }

}

public class DummyThreadFun {

    public static void main(String[] args) {
        System.out.println("currentThread : " + Thread.currentThread());
        ThreadFun tf = new ThreadFun();
        tf.start();
        System.out.println(tf.isAlive());
        System.out.println("currentThread : " + Thread.currentThread());
    }
}