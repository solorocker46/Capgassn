package march10;

public class UnboxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		int b = a; //Unboxing
		System.out.println("a = "+a+" b = "+b);
		int c = a.intValue(); //wrapper
		System.out.println("c = "+c);
	}

}
