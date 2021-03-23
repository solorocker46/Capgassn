import java.util.*;

public class HashMap_Demo {

 public static void main(String[] args) {

  HashMap<Integer, String> map = new HashMap<>();
  map.put(13, "Vinod");
  map.put(6, "Amol");
  map.put(28, "Nandan");
  map.put(12, "Rahul");
  System.out.println(map);
  // Iterating over hashmap
  for (Map.Entry<Integer, String> entry : map.entrySet()) {
   Integer key = entry.getKey();
   String value = entry.getValue();
   System.out.println(key + " " + value);
  }

  System.out.println("HashMap size= " + map.size());
  
  // Checking and searching
  if (map.containsKey(8)) {
   System.out.println("HashMap has a given key");
  } else {
   System.out.println("HashMap hasn't a given key");
  }

  // Remove the content of the hashMap
  map.clear();

  // Check if the hashMap empty
  if (map.isEmpty())
  {
   System.out.println("The hashMap is empty");
  }
 }
}
