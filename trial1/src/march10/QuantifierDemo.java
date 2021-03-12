package march10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================a==============");
		Matcher m1 = Pattern.compile("a").matcher("abaabaaaabbbaab");
		while(m1.find())
		{
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}
		System.out.println("================a+=======================");
		Matcher m2 = Pattern.compile("a+").matcher("abaabaaaabbbaab");
		while(m2.find())
		{
			System.out.println(m2.start()+" "+m2.end()+" "+m2.group());
		}
		System.out.println("================a*=======================");
		Matcher m3 = Pattern.compile("a*").matcher("abaabaaaabbbaab");
		while(m3.find())
		{
			System.out.println(m3.start()+" "+m3.end()+" "+m3.group());
		}
		System.out.println("================a?=======================");
		Matcher m4 = Pattern.compile("a?").matcher("abaabaaaabbbaab");
		while(m4.find())
		{
			System.out.println(m4.start()+" "+m4.end()+" "+m4.group());
		}
	}

}
