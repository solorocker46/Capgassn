package collectionFrameworks;
import java.util.*;
class Voters
{
	List<Integer> votersList(Map<Integer, Integer> details)
	{
		List<Integer> ids = new ArrayList<>();
		for(Map.Entry<Integer, Integer> hm: details.entrySet())
		{
			if(hm.getValue() >= 18)
			{
				ids.add(hm.getKey());
			}
		}
		return ids;
	}
}
public class assn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer, Integer> details = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			details.put(scanner.nextInt(), scanner.nextInt());
		}
		Voters voters = new Voters();
		System.out.println(voters.votersList(details));
	}

}
