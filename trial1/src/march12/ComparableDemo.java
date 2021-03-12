package march12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	String dept;
	int salary;
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	public int compareTo(Employee o)
	{
		if(id == o.id)
			return 0;
		else if(id > o.id)
			return 1;
		else
			return -1;
	}
}
/**
 * @author Sushma S
 *
 */
public class ComparableDemo {
	
	
	static ArrayList<Employee> findByDept(String department, ArrayList<Employee> empList)
	{
		ArrayList<Employee> myList = new ArrayList<>();
		Iterator<Employee> i = empList.iterator();
		while(i.hasNext())
		{
			Employee e = i.next();
			if(e.dept.equals(department))
			{
				myList.add(e);
			}

		}
		return myList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a = new ArrayList<>();
		a.add(new Employee(2, "Ravi", "HR", 20000));
		a.add(new Employee(1, "Anil", "Developer", 50000));
		a.add(new Employee(3, "Ramesh", "UI", 65000));
		a.add(new Employee(4, "Suresh", "Developer", 78000));
		System.out.println(findByDept("Developer", a));
		Collections.sort(a);
		System.out.println(a);
	}

}
