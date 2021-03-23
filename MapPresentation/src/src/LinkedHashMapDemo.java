package src;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

 public static void main(String[] args) {
  LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

  map.put(13, "Vinod");
  map.put(6, "Amol");
  map.put(28, "Nandan");
  map.put(12, "Rahul");
  System.out.println(map);
  // Iterating over linkedHashMap
  for (Map.Entry<Integer, String> entry : map.entrySet()) {
   Integer key = entry.getKey();
   String value = entry.getValue();
   System.out.println(key + " " + value);
  }

  System.out.println("LinkedHashMap size= " + map.size());

  // Checking and searching
  if (map.containsKey(8)) {
   System.out.println("LinkedHashMap has a given key");
  } else {
   System.out.println("LinkedHashMap hasn't a given key");
  }

  // Remove the content of the LinkedhashMap
  map.clear();

  // Check if the LinkedhashMap empty
  if (map.isEmpty()){
   System.out.println("The LinkedhashMap is empty");
  }
 }
}