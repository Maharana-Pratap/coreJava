package singalton;

public class SingaltonTest {

	public static void main(String[] args) {
		Object o1 = Test.getTest();
		Object o2 = Test.getTest();
		
		System.out.println(o1==o2);
	}
}
