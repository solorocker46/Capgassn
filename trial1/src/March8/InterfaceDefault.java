package March8;
interface College
{
	void dept();
	default void lab()
	{
		System.out.println("Do lab");
	}
	
}
class Mech implements College
{

	@Override
	public void dept() {
		// TODO Auto-generated method stub
		System.out.println("Mech dept.");
		
	}

	@Override
	public void lab() {
		// TODO Auto-generated method stub
		//College.super.lab();
		System.out.println("Hiee, hello!");
	}
	
}
public class InterfaceDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College college = new Mech();
		college.dept();
		college.lab();
	}

}
