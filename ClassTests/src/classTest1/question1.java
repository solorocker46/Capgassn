package classTest1;
class Fruit
{
	String name;
	String taste;
	public Fruit(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}

	void eat()
	{
		System.out.println("Name of the fruit = "+name+" and taste = "+taste);
	}
}
class Apple extends Fruit
{

	public Apple(String name, String taste) {
		super(name, taste);
		// TODO Auto-generated constructor stub
	}
	void eat()
	{
		System.out.println("Apple Class: Name = "+name+" and taste = "+taste);
	}
	
}
class Orange extends Fruit
{

	public Orange(String name, String taste) {
		super(name, taste);
		// TODO Auto-generated constructor stub
	}
	void eat()
	{
		System.out.println("Orange Class: Name = "+name+" and taste = "+taste);
	}
	
}
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit appleFruit = new Apple("Apple", "Sweet");
		Fruit orangeFruit = new Orange("Orange", "Tangy");
		appleFruit.eat();
		orangeFruit.eat();
	}

}
