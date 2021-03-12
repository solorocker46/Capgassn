package march11;

import java.util.*;

public class CollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		System.out.println(myList);
		List<Integer> myList1 = new ArrayList<>();
		myList1.add(3);
		myList1.add(4);
		myList1.add(100);
		myList1.add(101);
		myList1.add(102);
		System.out.println(myList1);
		myList1.addAll(myList);
		System.out.println(myList1);
		myList1.removeAll(myList);
		System.out.println(myList1);
		myList1.addAll(myList);
		myList1.retainAll(myList);
		System.out.println(myList1);
	}

}
