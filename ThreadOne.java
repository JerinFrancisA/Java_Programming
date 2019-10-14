
class Thread1 extends Thread{
	public void run() {
		for(int i=1; i<=100; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for(int i=1; i<=100; i++) {
			try {
				if(i%12 == 0) {
					System.out.println(i);
				}
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadOne {
	
	public static void main(String[] args) {
		Thread1 T1obj = new Thread1();
		Thread2 T2obj = new Thread2();
		T1obj.start();
		T2obj.start();
	}

}
