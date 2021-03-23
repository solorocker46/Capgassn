package march16;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = Arrays.asList(11,1,2,3);
		int i = ll.stream().reduce((a,b)->a+b).get();
		System.out.println(i);
		System.out.println();
		
		List<String> sl = Arrays.asList("Hello", "Welcome", "Bye");
		sl.forEach(s->System.out.println(s));
		Optional<String> greeting = sl.stream().reduce((a,b)->a.concat(b));
		System.out.println(greeting);
	}

}
