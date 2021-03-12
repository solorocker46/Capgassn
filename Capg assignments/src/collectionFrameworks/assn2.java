package collectionFrameworks;
import java.util.*;
class Count
{
	Map<Character, Integer> countChars(char arr[])
	{
		Map<Character, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(hm.get(arr[i]) == null)
			{
				hm.put(arr[i], 1);
			}
			else
			{
				int val = hm.get(arr[i]);
				val += 1;
				hm.put(arr[i], val);
			}
		}
		return hm;
	}
}
public class assn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char arr[] = new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scanner.next().charAt(0);
		}
		Count count = new Count();
		Map<Character, Integer> hm = count.countChars(arr);
		System.out.println(hm);
	}

}
