package day2;
import java.util.*;
public class variablePractice 
{
	int var = 1;
	static int a = 1;
	void display1()
	{
		int var1 = 2;
		System.out.println("In display 1");
		System.out.println("var = "+var);
		System.out.println("var1 = "+var1);
		System.out.println("a = "+a);
	}
	void display2()
	{
		int var2 = 2;
		System.out.println("In display 2");
		System.out.println("var = "+var);
		System.out.println("var2 = "+var2);
		System.out.println("a = "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variablePractice vp = new variablePractice();
		System.out.println("a = "+a);
		System.out.println("var = "+vp.var);
		vp.display1();
		vp.display2();
	}

}
