package map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
	Map<Integer, String> mp = new HashMap<Integer,String>();
	mp.put(1, "java");
	
	System.out.println(mp.containsKey(1));
	System.out.println(mp.containsValue("java"));
	System.out.println(mp.get(1));
}
}