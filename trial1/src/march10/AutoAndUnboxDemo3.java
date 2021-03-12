package march10;

public class AutoAndUnboxDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = new Integer(100);
		Integer b = new Integer(100);
		System.out.println(a==b); // Checks address also
		System.out.println(a.equals(b)); // Checks only for content
		Integer c = 100;//As literal is assigned, it will refer to same constant pool
		Integer d = 100;
		System.out.println(c == d);
		System.out.println(c.equals(d));
	}

}
