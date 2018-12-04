package test;

public class ThreadTest extends Thread{
	public void run(){  
		for(int i=1;i<=5;i++)  
		System.out.println(i);  
		}  
		  
		public static void main(String args[]){  
			ThreadTest t1=new ThreadTest();  
		t1.start();  
		  
		t1.interrupt();  
		}
}
