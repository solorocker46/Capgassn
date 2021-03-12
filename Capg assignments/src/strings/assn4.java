package strings;
import java.util.*;
class Numbers
{
	int modifyNumber(int num)
	{
		Integer intValue = num;
		String temp = intValue.toString();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<temp.length();i++)
		{
			if(i != temp.length() - 1)
			{
				sb.append(Math.abs((int)temp.charAt(i) - (int)temp.charAt(i+1)));
			}
			else
				sb.append(temp.charAt(i));
		}
		temp = sb.toString();
		int newNum = Integer.parseInt(temp);
		return newNum;
	}
}
public class assn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Numbers number = new Numbers();
		int res = number.modifyNumber(num);
		System.out.println(res);
	}

}
