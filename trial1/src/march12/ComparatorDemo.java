package march12;
import java.util.*;
class Student
{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
class IdComparator implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.id == o2.id)
			return 0;
		else if(o1.id > o2.id)
			return 1;
		return -1;
	}
	
}
class NameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
	
}
class MarksComparator implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.marks == o2.marks)
			return 0;
		else if(o1.marks > o2.marks)
			return 1;
		return -1;
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(new Student(1, "Sachin", 45));
		a.add(new Student(4, "Rahul", 99));
		a.add(new Student(3, "Ravi", 65));
		a.add(new Student(2, "Lara", 85));
		Collections.sort(a, new IdComparator());
		System.out.println(a);
		Collections.sort(a, new NameComparator());
		System.out.println(a);
		Collections.sort(a, new MarksComparator());
		System.out.println(a);
	}

}
