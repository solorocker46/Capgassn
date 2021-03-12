package march11;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		ListIterator<Integer> it = myList.listIterator();
		System.out.println("Forward direction");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Backward direction");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}

}
