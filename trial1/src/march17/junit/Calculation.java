package march17.junit;

public class Calculation {
	
	int add(int a, int b)
	{
		int result = 0;
		if(a >= 0 && b >= 0)
		{
			result = a + b;
		}
		return result;
	}
	boolean nameTest(String str)
	{
		return str.startsWith("A");
	}
	boolean palindrome(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		String newStr = sb.reverse().toString();
		return (str.equals(newStr));
	}
}
