package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpComparable{

	public static void main(String...args) {
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(3,"java",".Net"));
		emps.add(new Employee(1,"php","abc"));
		emps.add(new Employee(2,"abc","oracle"));
		
		Collections.sort(emps);
		Collections.sort(emps);
		
		for(Employee emp : emps) {
			System.out.println(emp.id+" : "+emp.name+" : "+emp.location);
		}
	}
}
