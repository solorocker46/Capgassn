package random;
import java.util.*;
@FunctionalInterface
interface StringManipulation
{
	String manipulate(String myString);
}
public class assn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.nextLine();
		StringManipulation sm = (tempString) ->
		{
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<tempString.length();i++)
			{
				sb.append(tempString.charAt(i));
				if(i == tempString.length()-1)
				{
					break;
				}
				else
				{
					sb.append(' ');
				}
			}
			tempString = sb.toString();
			return tempString;
		};
		String res = sm.manipulate(myString);
		System.out.println(res);
	}

}
