package march11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		System.out.println(myList);
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext())
		{
			int num = it.next();
			//System.out.println(num);
			if(num < 3)
				it.remove();
			//System.out.println(num);
		}
		//System.out.println("Iterator = "+it);
		System.out.println("MyList = "+myList);
	}

}
