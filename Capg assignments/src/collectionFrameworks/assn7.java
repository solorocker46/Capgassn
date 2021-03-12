package collectionFrameworks;
import java.util.*;
class ArraySort
{
	int[] getSorted(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			Integer intValue = arr[i];
			String str = intValue.toString();
			//System.out.println(str);
			StringBuffer sb = new StringBuffer(str);
			sb.reverse();
			str = sb.toString();
			arr[i] = Integer.parseInt(str);
		}
		Arrays.sort(arr);
		return arr;
	}
}
public class assn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scanner.nextInt();
		}
		ArraySort as = new ArraySort();
		arr = as.getSorted(arr);
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

}
