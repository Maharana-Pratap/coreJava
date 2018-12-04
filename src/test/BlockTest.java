package test;

public class BlockTest {
	
	{
		System.out.println("NonStatic");
	}

	BlockTest(){
		System.out.println("Cunstructor");
	}
	
	static {
		System.out.println("Static");
	}
	public static void main(String[] args) {
		BlockTest v = new BlockTest();
	}
}
