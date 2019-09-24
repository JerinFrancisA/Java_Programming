package lab3;

import java.util.Scanner;

class Handler {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		System.out.print("JAVA ");
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		while (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		valueSet = true;
		System.out.print("PROGRAMMING\n");
		notify();
	}
}

class JAVA implements Runnable {
	Handler Handler;

	JAVA(Handler Handler) {
		this.Handler = Handler;
		new Thread(this, "JAVA").start();
	}

	public void run() {
		int i = 0;
		while (true) {
			Handler.put(i++);
		}
	}
}

class PROGRAMMING implements Runnable {
	Handler Handler;

	PROGRAMMING(Handler Handler) {
		this.Handler = Handler;
		new Thread(this, "PROGRAMMING").start();
	}

	public void run() {
		while (true) {
			Handler.get();
		}
	}
}

class JavaProgramming {
	public static void main(String args[]) {
		Handler Handler = new Handler();
		new JAVA(Handler);
		new PROGRAMMING(Handler);
		System.out.println("Press Control-C to stop.");
		while(true) {
			if(new Scanner(System.in).nextInt() == 1) {
				System.exit(0);
			}
		}
	}
}

//import java.util.Scanner;
//
//class Java extends Thread{
//	public void run() {
//		while(true) {
//			synchronized(this){
//				System.out.print("JAVA ");
//				try {
//					wait();
//					notify();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//}
//
//class Programming extends Thread {
//	public void run() {
//		while(true) {
//			synchronized(this){
//				System.out.print("PROGRAMMING\n");
//				try {
//					wait();
//					notify();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//}
//
//public class JavaProgramming {
//
//	public static void main(String[] args) {
//		Java javaObj = new Java();
//		Programming  progObj = new Programming();
//		javaObj.start();
//		progObj.start();
//		while(true) {
//			if(new Scanner(System.in).nextInt() == 1) {
//				System.exit(0);
//			}
//			
//		}
//
//	}
//
//}
