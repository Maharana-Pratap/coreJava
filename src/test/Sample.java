package test;

public class Sample {
	public static void main(String... args) {
		try {
			int i = 10/0;
			System.out.println("throw");
		}catch(ArithmeticException e) {
			System.out.println("catch");
			return;
		}finally {
			System.out.println("finally");
		}
		System.out.println("after all");
	}
} 