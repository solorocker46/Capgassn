package march11;
class Employee1
{
	int id;
	String name;
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hi";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Employee1 emp = new Employee1(1, "Sam");
		Employee1 emp1 = new Employee1(1, "Sam");
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
	}

}
