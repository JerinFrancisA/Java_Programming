
class H extends Thread{
	int i = 0;
	public void run() {
		while(true) {
			i++;
			System.out.println(i%12);
			try {
				Thread.sleep(3600000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class M extends Thread{
	int i = 0;
	public void run() {
		while(true) {
			i++;
			System.out.println(i%60);
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class S extends Thread{
	int i = 0;
	public void run() {
		while(true) {
			i++;
			System.out.println(i%60);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreeThreads {

	public static void main(String[] args) {
		H h = new H();
		M m = new M();
		S s = new S();
		h.start();
		m.start();
		s.start();
	}

}
