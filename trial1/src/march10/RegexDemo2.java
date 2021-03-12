package march10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================m1 looks for a,b,c==============");
		Matcher m1 = Pattern.compile("[abc]").matcher("hello@123java");
		while(m1.find())
		{
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}
		System.out.println("================m2 looks for everything except a,b,c=======================");
		Matcher m2 = Pattern.compile("[^abc]").matcher("hello@123java");
		while(m2.find())
		{
			System.out.println(m2.start()+" "+m2.end()+" "+m2.group());
		}
		System.out.println("================m3 looks for a-z and A-Z except for numbers=======================");
		Matcher m3 = Pattern.compile("[a-zA-Z]").matcher("Hello@123Java");
		while(m3.find())
		{
			System.out.println(m3.start()+" "+m3.end()+" "+m3.group());
		}
		System.out.println("================m4 looks for numbers=======================");
		Matcher m4 = Pattern.compile("\\d").matcher("Hello@123Java");
		while(m4.find())
		{
			System.out.println(m4.start()+" "+m4.end()+" "+m4.group());
		}
		System.out.println("================m5 looks for any character except special characters=======================");
		Matcher m5 = Pattern.compile("\\w").matcher("Hello@123Java");
		while(m5.find())
		{
			System.out.println(m5.start()+" "+m5.end()+" "+m5.group());
		}
		System.out.println("================m5 looks for any character including special characters=======================");
		Matcher m6 = Pattern.compile(".").matcher("Hello@123Java");
		while(m6.find())
		{
			System.out.println(m6.start()+" "+m6.end()+" "+m6.group());
		}
	}

}
