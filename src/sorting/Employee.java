package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{

	Integer id;
	String name;
	String location;
	
	Employee(Integer id, String name, String location) {
		this.id=id; this.name=name; this.location=location;
	}	

	
	/*public int compareTo(Employee emp) {
		return this.name.compareTo(emp.name);
	}*/
	@Override
	public int compareTo(Employee e) {
		if(this.id == e.id)
			return 0;
		else if(this.id > e.id)
			return 1;
		else
			return 0;
	}
	
	public static void main(String... args) {
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(3,"java","Net"));
		emps.add(new Employee(1,"php","abc"));
		emps.add(new Employee(2,"abc","oracle"));
		
		Collections.sort(emps);
		//Collections.sort(emps);
		
		for(Employee emp : emps) {
			System.out.println(emp.id+" : "+emp.name+" : "+emp.location);
		}
	}
	
}
