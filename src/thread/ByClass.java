package thread;

public class ByClass extends Thread{

	public void run() {
		System.out.println("just for testing");
	}
	
	public static void main(String[] args) {
		ByClass c1 = new ByClass();
		c1.start();
	}
}
 