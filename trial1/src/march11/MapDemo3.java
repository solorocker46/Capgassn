package march11;
import java.util.*;
class Student
{
	private int id;
	private String name;
	private String dept;
	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
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
		Student other = (Student) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
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
public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student, Integer> studentMarkList = new HashMap<>();
		studentMarkList.put(new Student(1, "Rahul", "Mech"), 89);
		studentMarkList.put(new Student(2, "Sachin", "CSE"), 53);
		studentMarkList.put(new Student(3, "Jai", "Physics"), 99);
		studentMarkList.put(new Student(3, "Jai", "Physics"), 100);
		System.out.println("Student marks list = "+studentMarkList);
		for(Map.Entry<Student, Integer> stud: studentMarkList.entrySet())
		{
			System.out.println(stud);
		}
	}

}
