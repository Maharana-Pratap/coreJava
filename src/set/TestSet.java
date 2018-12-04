package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		boolean one = set.add("java");
		boolean two = set.add("php");
		boolean three = set.add("java");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(set.size());
	}
}
