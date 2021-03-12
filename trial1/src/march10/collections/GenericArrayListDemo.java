package march10.collections;
import java.util.*;
public class GenericArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		for(Integer i:myList)
		{
			System.out.println(i);
		}
	}

}
