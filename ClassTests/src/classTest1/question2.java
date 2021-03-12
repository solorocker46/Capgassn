package classTest1;
class Shape
{
	void draw()
	{
		System.out.println("Drawing shape");
	}
	void erase()
	{
		System.out.println("Erasing shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing circle");
	}
	void erase()
	{
		System.out.println("Erasing circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing triangle");
	}
	void erase()
	{
		System.out.println("Erasing triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing square");
	}
	void erase()
	{
		System.out.println("Erasing square");
	}
}
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();
		Shape triangle = new Triangle();
		Shape square = new Square();
		circle.draw();
		triangle.draw();
		square.draw();
		circle.erase();
		triangle.erase();
		square.erase();
	}

}
