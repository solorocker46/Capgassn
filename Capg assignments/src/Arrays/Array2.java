package Arrays;
import java.util.*;
class StringArray
{
	String[] ArraySorting(String[] myArray)
	{
		Arrays.sort(myArray);
		int length = myArray.length;
		int half;
		if(length % 2 == 0)
		{
			half = length / 2;
		}
		else
		{
			half = (length / 2) + 1;
		}
		for(int i=0;i<half;i++)
		{
			myArray[i] = myArray[i].toUpperCase();
		}
		for(int i=half;i<length;i++)
		{
			myArray[i] = myArray[i].toLowerCase();
		}
		return myArray;
	}
}
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nValue = scanner.nextInt();
		String myArray[] = new String[nValue];
		for(int i=0;i<nValue;i++)
		{
			myArray[i] = scanner.next();
		}
		StringArray strarray = new StringArray();
		String result[] = strarray.ArraySorting(myArray);
		for(int i=0;i<nValue;i++)
		{
			System.out.println(myArray[i]);
		}
	}

}
