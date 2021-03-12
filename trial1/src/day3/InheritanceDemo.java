package day3;
class Person
{
	int id;
	String name;
	int age;
	void display()
	{
		System.out.println("This is the display method of base class");
	}
}
class Student extends Person
{
	String dept;
}
class Cricketer extends Person
{
	String role;
	void displayDetails()
	{
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Role = "+role);
	}
}
class Manager extends Person
{
	int experience;
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer cricketer = new Cricketer();
		cricketer.id = 123;
		cricketer.name = "Virat";
		cricketer.age = 34;
		cricketer.role = "Spinner";
		cricketer.display();
		cricketer.displayDetails();
	}

}
