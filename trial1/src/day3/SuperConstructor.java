package day3;
class Parent
{
	int id;
	//Parent's default constructor in this case will not be called.
	Parent()
	{
		System.out.println("This is parent's default constructor");
	}
	Parent(int id)
	{
		this.id = id;
		System.out.println("This is parent constructor and id = "+id);
	}
}
class Child extends Parent
{
	Child(int id)
	{
		super(id);
		System.out.println("This is child constructor");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child(10);
	}

}
