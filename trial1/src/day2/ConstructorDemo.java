package day2;
class StudDetailsConstructor
{
	int id;
	String name;
	StudDetailsConstructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudDetailsConstructor [id=" + id + ", name=" + name + "]";
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudDetailsConstructor stud1 = new StudDetailsConstructor(123, "Sushma");
		System.out.println(stud1);
	}

}
