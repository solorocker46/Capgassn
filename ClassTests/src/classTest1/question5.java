package classTest1;

import java.util.Scanner;

class StringRepetition
{
	String repeatEnd(String str, int n)
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<n;i++)
		{
			sb.append(str.substring(str.length()-n));
		}
		return sb.toString();
	}
}
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int n = scanner.nextInt();
		StringRepetition sr = new StringRepetition();
		System.out.println(sr.repeatEnd(str, n));
	}

}
