package src;

import java.util.ArrayList;

public class EmployeeImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a = new ArrayList<>();
		a.add(new Employee(5, "Siddharth Bharadwaj", "HR", 90000, 26));
		a.add(new Employee(3, "Jai Vashishtha", "Developer", 86000, 22));
		a.add(new Employee(2, "Sushma S", "Developer", 100000, 21));
		a.add(new Employee(1, "Prithvi S", "Tester", 40000, 23));
		a.add(new Employee(4, "Aishwarya UK", "Analyst", 80000, 25));
		a.forEach(s->System.out.println(s));
		a.forEach(System.out::println);
		long count = a.stream().count();
		System.out.println(count);
		a.stream().filter(e->e.getDept().equals("Developer")).forEach(s->System.out.println(s));
		long count1 = a.stream().filter(e->e.getDept().equals("Developer")).count();
		System.out.println(count1);
		a.stream().map(e->e.getName().length()).forEach(s->System.out.println(s));
		a.stream().map(e->e.getSalary()*1.1).forEach(s->System.out.println(s));
		int sum = a.stream().mapToInt(e->e.getSalary()).sum();
		System.out.println(sum);
	}

}
