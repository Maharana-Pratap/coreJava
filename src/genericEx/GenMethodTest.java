package genericEx;

public class GenMethodTest {

	public static <E> void  printArray(E[] parray){
		for(E element : parray) {
			System.out.printf("%s",element);
		}
	}
	
	public static void main(String[] ars) {
		Integer[] paray = {2,3,5,7};
		Double[] darr = {1.1,3.1,6.1,8.1};
		String[] sarr = {"ff","yu","rt"};
		
		System.out.println("Integer Array Printed");
		printArray(paray);
		
		System.out.println("Double Array Printed");
		printArray(darr);
		
		System.out.println("String Array Printed");
		printArray(sarr);
	}
}
