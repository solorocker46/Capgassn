package collectionFrameworks;
import java.util.*;
class StudentEligibility
{
	HashMap<Integer, String> getStudents(HashMap<Integer, Integer> details)
	{
		HashMap<Integer, String> medal = new HashMap<Integer, String>();
		for(Map.Entry<Integer, Integer> hm: details.entrySet())
		{
			if(hm.getValue() >= 90)
			{
				medal.put(hm.getKey(), "gold");
			}
			else if(hm.getValue() >= 80 && hm.getValue() < 90)
			{
				medal.put(hm.getKey(), "silver");
			}
			else if(hm.getValue() >= 70 && hm.getValue() < 80)
			{
				medal.put(hm.getKey(), "bronze");
			}
			else
			{
				medal.put(hm.getKey(), "no medal");
			}
		}
		return medal;
	}
}
public class assn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, Integer> details = new HashMap<Integer, Integer>();
		int n = scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			details.put(scanner.nextInt(), scanner.nextInt());
		}
		StudentEligibility se = new StudentEligibility();
		HashMap<Integer, String> result = se.getStudents(details);
		System.out.println(result);
	}

}
