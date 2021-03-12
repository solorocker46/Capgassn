package march10;

public class WrapperDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer b = a; // autoboxing
		System.out.println("a = "+a+" and b = "+b);
		Integer c = Integer.valueOf(a); // wrapper
		System.out.println("c = "+c);
	}

}
