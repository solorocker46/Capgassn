package march11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Sachin", "Sachin is a batsman");
		hm.put("Rahul", "Rahul is a wicket keeper");
		hm.put("Bumrah", "Bumrah is a bowler");
		System.out.println(hm);
		hm.replace("Sachin", "retired");
		System.out.println(hm);
		hm.put("Rahul", "Coach");
		System.out.println(hm);
		hm.remove("Bumrah");
		System.out.println("After removing: "+hm);
		System.out.println("==============Keys==============");
		for(String key:hm.keySet())
		{
			System.out.println("Key = "+key);
			System.out.println("Value = "+hm.get(key));
		}
		System.out.println("==============Values==============");
		for(String val:hm.values())
		{
			System.out.println("Value = "+val);
		}
		System.out.println("==============Entries==============");
		for(Map.Entry<String, String> entry: hm.entrySet())
		{
			System.out.println(entry);
		}
		System.out.println("==============Entries with condition==============");
		for(Map.Entry<String, String> entry: hm.entrySet())
		{
			if(entry.getKey() == "Sachin")
				System.out.println(entry);
		}
	}

}
