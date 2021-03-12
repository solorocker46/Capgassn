package collectionFrameworks;
import java.util.*;
class SecondSmallest
{
	int getSecondSmallest(int arr[])
	{
		List<Integer> myList = new ArrayList<>();
		for(int element: arr)
		{
			myList.add(element);
		}
		Collections.sort(myList);
		return myList.get(1);
	}
}
public class assn5 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scanner.nextInt();
		}
		SecondSmallest ss = new SecondSmallest();
		System.out.println(ss.getSecondSmallest(arr));
	}
}
