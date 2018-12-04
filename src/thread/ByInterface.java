package thread;

public class ByInterface implements Runnable{

	@Override
	public void run() {
		
		System.out.println("just for testing: "+ Thread.currentThread().getName());
		
	}
	
	public static void main(String args[]) {
		Thread t1 = new Thread(new ByInterface());
		Thread t2 = new Thread(new ByInterface());
		t2.setName("t2");
		t1.setName("t1");
		t2.start();
		t1.start();
		//t2.start();
	}

}
