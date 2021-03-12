package march10.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList myList = new ArrayList();
		System.out.println("Before adding elements, size = "+myList.size());
		myList.add(1); //internally autoboxing will happen
		myList.add(null);
		myList.add("Hiee:");
		myList.add('d');
		System.out.println("After adding elements, size = "+myList.size());
		System.out.println("Elements are: "+myList);
		myList.add(2, "GGGggg");
		myList.remove("Hiee:");
		myList.remove(1);
		myList.remove(Integer.valueOf(1));
		System.out.println("Elements are: "+myList);
		System.out.println("d = ?: "+myList.contains('d'));
		myList.set(0, "aaaaa");
		System.out.println("Elements are = "+myList);
		myList.clear();
		System.out.println("Elements are: "+myList);
	}

}
