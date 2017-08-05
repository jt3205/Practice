
public class Thread_1 extends Thread {
	int seq;
	public Thread_1(int seq) {
		this.seq = seq;
	}
	public void run(){
		System.out.println(seq+"thread start.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(seq+"thread end.");
	}

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Thread_1 th = new Thread_1(i);
			th.start();
		}
		System.out.println("main end.");
		
	}

}