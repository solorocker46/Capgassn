package march16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a = new ArrayList<>();
		a.add(new Employee(1, "Siddharth Bharadwaj", "HR", 90000, 26));
		a.add(new Employee(2, "Jai Vashishtha", "Developer", 86000, 22));
		a.add(new Employee(3, "Sushma S", "Developer", 100000, 22));
		a.add(new Employee(4, "Prithvi S", "Tester", 40000, 22));
		a.add(new Employee(5, "Aishwarya UK", "Analyst", 80000, 22));
		System.out.println(a);
		a.forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("By using method reference");
		a.forEach(System.out::print);
		System.out.println();
		System.out.println();
		
		System.out.println("To get employee count");
		long empCount = a.stream().count();
		System.out.println("Employee count = "+empCount);
		System.out.println();
		
		System.out.println("To return only developer records");
		a.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("To return count of developers");
		long count2 = a.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).count();
		System.out.println("Developers count = "+count2);
		System.out.println();
		
		System.out.println("To find length of each name");
		a.stream().map(e->e.getName()+" "+e.getName().length()+" "+e.getDept()).forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("To increase salary by 10%");
		a.stream().map(e->e.getName()+" "+e.getSalary()+" "+(e.getSalary()*1.1)).forEach(s->System.out.println("%0.2f"+s));
		System.out.println();
		
		System.out.println("To get total employee salary");
		int sal = a.stream().mapToInt(e->e.getSalary()).sum();
		System.out.println("Total employee salary = "+sal);
		System.out.println();
		
		System.out.println("To get total developers salary");
		int devsal = a.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).mapToInt(e->e.getSalary()).sum();
		System.out.println("Total developers salary = "+devsal);
		System.out.println();
		
		System.out.println("To print all developers names");
		a.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).map(e->e.getName()).forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("To get all employee names starting with r to a list");
		List<Employee> emp = a.stream().filter(e->e.getName().startsWith("S")).collect(Collectors.toList());
		System.out.println(emp);
		System.out.println();
		
		System.out.println("To print all employee names who are not developers");
		a.stream().filter(e->e.getDept() != "Developer").map(e->e.getName()).forEach(s->System.out.println(s));
		System.out.println();
	}

}
