package day2;
class stud1 
{
	int id;
	String name;
	void disp()
	{
		System.out.println("This is output");
	}
	stud1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "stud1 [id=" + id + ", name=" + name + "]";
	}
	
}
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud1 stud = new stud1(123, "Sanya");
		stud.disp();
		System.out.println(stud);
	}

}
