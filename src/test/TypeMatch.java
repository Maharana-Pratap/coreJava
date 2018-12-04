package test;

public class TypeMatch {
	
	public void getCall(Number no) {
		System.out.println("number");
	}

	public void getCall(int no) {
		System.out.println("int");
	}
	
	public void getCall(Integer no) {
		System.out.println("integer");
	}
	
	public void getCall(double no) {
		System.out.println("Dauble");
	}
	
	public static void main(String[] args) {
		TypeMatch tm = new TypeMatch();
		tm.getCall(45.7);
	}
}
