package march16;

import java.util.ArrayList;
import java.util.Comparator;
/*class IdComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getId() == o2.getId())
			return 0;
		else if(o1.getId() > o2.getId())
			return 1;
		return -1;
	}
	
}*/
public class StreamSortingUserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a = new ArrayList<>();
		a.add(new Employee(4, "Siddharth Bharadwaj", "HR", 90000, 26));
		a.add(new Employee(1, "Jai Vashishtha", "Developer", 86000, 24));
		a.add(new Employee(3, "Sushma S", "Developer", 100000, 21));
		a.add(new Employee(2, "Prithvi S", "Tester", 40000, 22));
		a.add(new Employee(5, "Aishwarya UK", "Analyst", 80000, 21));
		a.forEach(s->System.out.println(s));
		System.out.println("After sorting");
		a.stream().sorted().forEach(s->System.out.println(s));
		System.out.println();
		System.out.println("To sort by name - we're using comparator as string is used for sorting");
		Comparator<Employee> nameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
		a.stream().sorted(nameComparator).forEach(s->System.out.println(s));
		System.out.println();
		System.out.println("To sort by id using comparator");
		//a.stream().sorted(new IdComparator()).forEach(s->System.out.println(s));
		Comparator<Employee> idComparator = (o1, o2) ->
		{
			if(o1.getId() == o2.getId())
				return 0;
			else if(o1.getId() > o2.getId())
				return 1;
			return -1;
		};
		a.stream().sorted(idComparator).forEach(s->System.out.println(s));
		System.out.println();
	}

}
