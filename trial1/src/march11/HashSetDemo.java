package march11;
import java.util.*;
class Employee2
{
	int id;
	String name;
	public Employee2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(3);
		hs.add(3);
		hs.add("Hello");
		hs.add('c');
		hs.add(100);
		System.out.println(hs);
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("hi");
		lhs.add("Hello");
		lhs.add(100);
		lhs.add("hi");
		System.out.println(lhs);
		TreeSet ts = new TreeSet();
		ts.add(20);
		ts.add(10);
		ts.add(5);
		ts.add(20);
		System.out.println(ts);
		
		TreeSet<Employee2> temp = new TreeSet<>();
		temp.add(new Employee2(1, "Rahul"));
		temp.add(new Employee2(2, "Sachin"));
		System.out.println(temp);
	}

}
