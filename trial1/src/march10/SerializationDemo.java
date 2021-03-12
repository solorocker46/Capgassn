package march10;
import java.io.*;
class Employee implements Serializable
{
	int id;
	String name;
	static int age;
	transient int salary;
	Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1, "Jai", 22, 40000);
		FileOutputStream fos = new FileOutputStream("four.txt");
		ObjectOutputStream ois = new ObjectOutputStream(fos);
		ois.writeObject(emp);
		ois.flush();
		ois.close();
		System.out.println("Serialization completed");
	}

}
