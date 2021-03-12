package day3;
class Employee2
{
	int id;
	String name;
	String dept;
	Address ad;			//Entity reference / Object reference
	public Employee2(int id, String name, String dept, Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.ad = ad;
	}
	void displayEmployeeDetails()
	{
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Department name = "+dept);
		System.out.println("Door number = "+ad.doorNo);
		System.out.println("Street name = "+ad.streetName);
		System.out.println("Pincode = "+ad.pincode);
	}
}
class Address
{
	int doorNo;
	String streetName;
	int pincode;
	public Address(int doorNo, String streetName, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.pincode = pincode;
	}
	
}
public class HasADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address(123, "MES Road", 567890);
		Employee2 emp2 = new Employee2(1, "Sushma", "HR", addr);
		emp2.displayEmployeeDetails();
		
		Employee2 emp3 = new Employee2(2, "Anshuman", "Manager", new Address(345, "Devinagar", 345678));
		emp3.displayEmployeeDetails();
	}

}
