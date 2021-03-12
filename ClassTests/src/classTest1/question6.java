package classTest1;
import java.util.*;
class StringManipulation
{
	String repeatFront(String str, int n)
	{
		StringBuffer sb = new StringBuffer();
		for(int i=n;i>=0;i--)
		{
			sb.append(str.substring(0, i));
		}
		return sb.toString(); 
	}
}
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int n = scanner.nextInt();
		StringManipulation sm = new StringManipulation();
		System.out.println(sm.repeatFront(str, n));
	}

}
