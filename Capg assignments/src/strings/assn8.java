package strings;
import java.util.*;
class PositiveString
{
	boolean checkPositiveString(String myString)
	{
		myString = myString.toLowerCase();
		for(int i=0;i<myString.length();i++)
		{
			if(i == myString.length()-1)
			{
				break;
			}
			else
			{
				if(myString.charAt(i) > myString.charAt(i+1))
				{
					return false;
				}
			}
		}
		return true;
	}
}
public class assn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.nextLine();
		PositiveString pos = new PositiveString();
		System.out.println(pos.checkPositiveString(myString));
		
	}

}
