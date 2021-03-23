package march16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeImplementationExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeImplementation> empList = new ArrayList<>();
		empList.add(new EmployeeImplementation(123, "Jai", 65000, "nitin", 10));
		empList.add(new EmployeeImplementation(256, "Aishwarya", 35000, "nitin", 20));
		empList.add(new EmployeeImplementation(156, "Sushma", 55000, "prithvi", 20));
		empList.add(new EmployeeImplementation(137, "Soumya", 25000, "anandu", 10));
		
		System.out.println(empList.stream().mapToDouble(e->e.getSalary()).max());
		System.out.println();
		
		List<EmployeeImplementation> ll = empList.stream().filter(e->e.getSalary() < 50000).collect(Collectors.toList());
		System.out.println("Salary < 50000: "+ll);
		System.out.println();
		
		long count = empList.stream().filter(e->e.getMgrname().equals("nitin")).count();
		System.out.println("Count of employees reporting to nitin: "+count);
		System.out.println();
		
		List<EmployeeImplementation> dept10 = empList.stream().filter(e->e.getDeptno() == 10).collect(Collectors.toList());
		System.out.println("Employees where deptno = 10: "+dept10);
		System.out.println();
		
		long count20 = empList.stream().filter(e->e.getDeptno() == 20).count();
		System.out.println("Count of employees where dept number = 20: "+count20);
		System.out.println();
		
		List<EmployeeImplementation> startA = empList.stream().filter(e->e.getName().startsWith("A")).collect(Collectors.toList());
		System.out.println("Employees names starting with A: "+startA);
		System.out.println();
	}

}
