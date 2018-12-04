package serialize;

import java.io.*;

public class SerialTest {

	public static void main(String[] args) {
		try {
			//Object o = new Object();
			Student st = new Student();
			st.setId(1);
			st.setName("Java");
			FileOutputStream fis = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(st);
			System.out.println("id : "+st.id+" name: "+st.name+" roll: "+st.roll);  // static member can not be seraialized;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
