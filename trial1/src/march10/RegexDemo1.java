package march10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("a");
		Pattern p1 = Pattern.compile("[abc]");
		Matcher m1 = p1.matcher("Sachin");
		while(m1.find())
		{
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}
	}

}
