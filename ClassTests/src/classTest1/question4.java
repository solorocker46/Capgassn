package classTest1;
import java.util.*;
class AppendCharacters
{
	String mixString(String a, String b)
	{
		StringBuffer sb = new StringBuffer();
		int i;
		for(i=0;i<a.length() && i<b.length();i++)
		{
			sb.append(a.charAt(i));
			sb.append(b.charAt(i));
		}
		if(i <= a.length() - 1)
		{
			sb.append(a.substring(i));
		}
		if(i <= b.length() - 1)
		{
			sb.append(b.substring(i));
		}
		return sb.toString();
	}
}
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		AppendCharacters appendchar = new AppendCharacters();
		System.out.println(appendchar.mixString(a, b));
	}

}
