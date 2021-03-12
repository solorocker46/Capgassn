package march11;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println(s);
		System.out.println(s.peek());
		s.push(4);
		System.out.println(s.pop());
		Enumeration e = s.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
