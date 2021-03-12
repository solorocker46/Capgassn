package day3;
class Employee
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee();
		employee1.setId(123);
		employee1.setName("Jai");
		int id = employee1.getId();
		String name = employee1.getName();
		System.out.println(id+" "+name);
	}

}
