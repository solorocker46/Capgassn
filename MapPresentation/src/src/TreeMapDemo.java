package src;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

 public static void main(String[] args) {

  TreeMap<Integer, String> tmap = new TreeMap();
  tmap.put(33, "Bangalore");
  tmap.put(11, "Mysore");
  tmap.put(44, "Mangalore");
  tmap.put(22, "Shimoga");
  System.out.println(tmap);
  // Iterating over hashmap
  for (Map.Entry<Integer, String> entry : tmap.entrySet()) {
   Integer key = entry.getKey();
   String value = entry.getValue();
   System.out.println(key + " " + value);
  }

  System.out.println("LinkedHashMap size= " + tmap.size());

  // Checking and searching
  if (tmap.containsKey(22)) {
   System.out.println("LinkedHashMap has a given key");
  } else {
   System.out.println("LinkedHashMap hasn't a given key");
  }

  // Remove the content of the hashMap
  tmap.clear();

  // Check if the hashMap empty
  if (tmap.isEmpty()){
   System.out.println("The LinkedhashMap is empty");
  }
 }
}
