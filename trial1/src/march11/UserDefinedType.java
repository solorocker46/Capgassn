package march11;
import java.util.*;
class Employee
{
	int id;
	String name;
	String dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}
public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Sushma", "FS"));
		emp.add(new Employee(2, "Anshu", "HR"));
		emp.add(new Employee(3, "Jai", "Healthcare"));
		System.out.println(emp);
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println(e.id+" "+e.name+" "+e.dept);
		}
	}

}
