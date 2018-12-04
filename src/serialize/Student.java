package serialize;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int id;
	transient String name;
	static String roll;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}

	public static String getRoll() {
		return roll;
	}

	public static void setRoll(String roll) {
		Student.roll = roll;
	}
}
