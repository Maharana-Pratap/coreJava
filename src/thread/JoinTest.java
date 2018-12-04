package thread;

public class JoinTest extends Thread{

	public void run() {
		for(int i=0; i<=3; i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String... args) {
		JoinTest t1 = new JoinTest();
		JoinTest t2 = new JoinTest();
		JoinTest t3 = new JoinTest();
		
		t1.setName("first");
		t2.setName("second");
		t3.setName("third");
		
		t1.start();
		//t2.start();
		try {
			//t1.join();
			t1.join(15000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		t2.start();
		t3.start();
	}
}
