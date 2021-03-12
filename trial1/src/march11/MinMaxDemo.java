package march11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		System.out.println(Collections.min(myList));
		System.out.println(Collections.max(myList));
	}

}
