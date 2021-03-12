package march11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> project1 = new ArrayList<>();
		project1.add("Sachin");
		project1.add("Rahul");
		project1.add("Amit");
		project1.add("Kumar");
		System.out.println(project1);
		Collections.sort(project1);
		System.out.println("After sorting: "+project1);
		Collections.reverse(project1);
		System.out.println("After reverse: "+project1);
		Collections.sort(project1);
		int index = Collections.binarySearch(project1, "Sachin");
		System.out.println("Element's index = "+index);
		index = Collections.binarySearch(project1, "Sushma");
		System.out.println("Element's index = "+index);
	}

}
