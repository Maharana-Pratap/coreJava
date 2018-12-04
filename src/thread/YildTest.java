package thread;

public class YildTest extends Thread{

	public void run() {
		for(int i=0; i<=3; i++) {
			System.out.println(Thread.currentThread().getName()+" in controll");
		}
	}
	
	public static void main(String... args) {
		YildTest t1 = new YildTest();
		YildTest t2 = new YildTest();
		
		t1.start();
		t2.start();
		
		for(int i=0; i<=3; i++) {
			t1.yield();
			System.out.println(Thread.currentThread().getName() + " in controll");  
		}
	}
}
