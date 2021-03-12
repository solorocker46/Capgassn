package march9;

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		System.out.println("String length = "+s1.length());
		System.out.println("Char at 1: "+s1.charAt(1));
		System.out.println("Char at 4: "+s1.charAt(4));
		System.out.println("Index of e: "+s1.indexOf('e'));
		System.out.println("Char at 1: "+s1.charAt(1));
		System.out.println("equals: "+s1.equals("Hello"));
		System.out.println("equals ignoring case: "+s1.equalsIgnoreCase("heLLO"));
		System.out.println("replace: "+s1.replace('l', 'p'));
		System.out.println("substring: "+s1.substring(1));
		System.out.println("substring: "+s1.substring(1, 4));
		String s2 ="          Welcome         "; 
		System.out.println("s2: "+s2+" hi");
		System.out.println("s2: "+s2.trim()+" hi");
		System.out.println("s1 uppercase: "+s1.toUpperCase());
		System.out.println("s1 lowercase: "+s1.toLowerCase());
		char ch[] = s1.toCharArray();
		for(char c: ch)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		String s3 = "hello welcome to java";
		String arr[] = s3.split(" ");
		for(String s: arr)
		{
			System.out.print(s+" ");
		}
		System.out.println();
	}

}
