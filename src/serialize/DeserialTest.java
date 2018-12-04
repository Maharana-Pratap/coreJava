package serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialTest {

	public static void main(String[] args) {
		try {
			FileInputStream fos = new FileInputStream("student.txt");
			ObjectInputStream oos = new ObjectInputStream(fos);
			Student st = (Student) oos.readObject();
			System.out.println("id: "+st.id+" name: "+st.name+" roll: "+st.roll); // static member can not be seraialized;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
