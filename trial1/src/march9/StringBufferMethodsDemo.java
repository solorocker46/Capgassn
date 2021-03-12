package march9;

public class StringBufferMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println("Initial Length = "+sb.length());
		System.out.println("Initial Capacity = "+sb.capacity());
		
		sb.append("Hello, welcome");
		
		System.out.println("Length = "+sb.length());
		System.out.println("Capacity = "+sb.capacity());//Initial value will be 16
		
		sb.append(" to Java");
		
		System.out.println("Length = "+sb.length());
		System.out.println("Capacity = "+sb.capacity());
		//Later capacity can be increased by (capacity = capacity * 2 + 2)
		//i.e; new capacity = 16 x 2 + 2 = 34
		
	}

}
