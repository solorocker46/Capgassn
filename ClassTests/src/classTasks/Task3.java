package classTasks;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import classTasks.Student;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studlist = new ArrayList<>();
		studlist.add(new Student(3, "Sachin", "cse", 45));
		studlist.add(new Student(1, "Rahul", "ece", 90));
		studlist.add(new Student(4, "Jai", "mech", 78));
		studlist.add(new Student(6, "Sid", "cse", 67));
		studlist.add(new Student(2, "Anshuman", "cse", 100));
		
		long count = studlist.stream().filter(e->e.getDept().equals("cse")).count();
		System.out.println("Count of students with department cse = "+count);
		Comparator<Student> nameComparator= (o1, o2) ->
		{
			return o1.getName().compareTo(o2.getName());
		};
		System.out.println("===================To sort by names in ascending order=================");
		studlist.stream().sorted(nameComparator).forEach(s->System.out.println(s));
		System.out.println("===================To sort by names in descending order===============");
		studlist.stream().sorted(nameComparator.reversed()).forEach(s->System.out.println(s));
	}

}
