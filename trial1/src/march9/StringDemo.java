package march9;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hi";
		String str = new String("Hello");
		String str1 = new String("Hello");
		System.out.println("s1 == s2: "+(s1 == s2));
		System.out.println("s1 == s3: "+(s1 == s3));
		System.out.println("str == str1: "+(str == str1));
		System.out.println("str.equals(str1): "+str.equals(str1));
		s1 = s1.concat(s3);
		System.out.println(s1);
	}

}
