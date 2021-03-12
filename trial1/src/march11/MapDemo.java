package march11;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Any order
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Sachin", "Sachin is a batsman");
		hm.put("Rahul", "Rahul is a wicket keeper");
		hm.put("Bumrah", "Bumrah is a bowler");
		System.out.println(hm);
		//Insertion order is maintained
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		lhm.put("Sachin", "Sachin is a batsman");
		lhm.put("Rahul", "Rahul is a wicket keeper");
		lhm.put("Bumrah", "Bumrah is a bowler");
		System.out.println(lhm);
		//Sorted order
		TreeMap<String, String> tm = new TreeMap<>();
		tm.put("Sachin", "Sachin is a batsman");
		tm.put("Rahul", "Rahul is a wicket keeper");
		tm.put("Bumrah", "Bumrah is a bowler");
		System.out.println(tm);
	}

}
