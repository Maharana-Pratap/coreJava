package singalton;

public class Test {
	
	private Test() {}

	private static Test obj = new Test();
	
	public static Test getTest() {
		return obj;
	}
}
