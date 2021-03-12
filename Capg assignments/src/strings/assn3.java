package strings;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Consonants
{
	String alterString(String myString)
	{
		char ch[] = myString.toCharArray();
		for(int i=0;i<myString.length();i++)
		{
			switch(myString.toLowerCase().charAt(i))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': break;
			default: ch[i] += 1;
			}
		}
		myString = new String(ch);
		return myString;
	}
}
public class assn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.nextLine();
		Consonants con = new Consonants();
		myString = con.alterString(myString);
		System.out.println(myString);
	}

}
