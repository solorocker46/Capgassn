package collectionFrameworks;
import java.util.*;
class Values
{
	List<Integer> getValues(Map<Integer, Integer> hm)
	{
		List<Integer> myList = new ArrayList<>();
		for(Integer val: hm.values())
		{
			myList.add(val);
		}
		Collections.sort(myList);
		return myList;
	}
}
public class assn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> hm = new HashMap<>();
		int n = scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			int key = scanner.nextInt();
			int value = scanner.nextInt();
			hm.put(key, value);
		}
		Values value = new Values();
		List<Integer> res = value.getValues(hm);
		System.out.println(res);
	}

}
