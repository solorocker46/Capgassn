package march16;

import java.util.function.Function;
import java.util.function.Predicate;

interface pre
{
	
}
public class InbuiltFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = (age)->age>18;
		boolean b = p1.test(34);
		System.out.println(b);
		Function<String, Integer> f1 = (name)->name.length();
		int len = f1.apply("Sachin");
		System.out.println(len);
		Function<String, String> f2 = (name)->name.concat(" Sharma");
		String newString = f2.apply("Siddharth");
		System.out.println(newString);
		
		
		Predicate<String> p2 = (str)->str.toLowerCase().startsWith("a");
		boolean b1 = p2.test("Apple");
		System.out.println(b1);
		Function<String, Boolean> f3 = (name)->name.toLowerCase().startsWith("a");
		Boolean b2 = f3.apply("Aisha");
		System.out.println(b2);
	} 

}
