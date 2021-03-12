package Arrays;
import java.util.*;
class ReverseSortArray
{
	int[] getSorted(int myArray[])
	{
		for(int i=0;i<myArray.length;i++)
		{
			Integer intValue = myArray[i];
			String temp = intValue.toString();
			StringBuilder sb = new StringBuilder();
			sb.append(temp);
			sb.reverse();
			temp = sb.toString();
			myArray[i] = Integer.parseInt(temp);
		}
		Arrays.sort(myArray);
		return myArray;
	}
}
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nValue = scanner.nextInt();
		int myArray[] = new int[nValue];
		for(int i=0;i<nValue;i++)
		{
			myArray[i] = scanner.nextInt();
		}
		ReverseSortArray reversesort = new ReverseSortArray();
		int res[] = reversesort.getSorted(myArray);
		for(int i=0;i<nValue;i++)
		{
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
	}

}
