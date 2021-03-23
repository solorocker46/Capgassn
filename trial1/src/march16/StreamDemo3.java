package march16;

import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = Arrays.asList(11,23,45,67,22,11);
		ll.stream().forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("Limiting the number of elements to 3 elements");
		ll.stream().limit(3).forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("Skip first 3 elements");
		ll.stream().skip(3).forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("To print distinct elements");
		ll.stream().distinct().forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("To check if all elements of the list is > 1. allMatch is a predicate function.");
		boolean ans = ll.stream().allMatch(s->s>1);
		System.out.println(ans);
		System.out.println();
		
		System.out.println("To check if all elements of the list is > 15. allMatch is a predicate function.");
		boolean ans1 = ll.stream().allMatch(s->s>15);
		System.out.println(ans1);
		System.out.println();
		
		System.out.println("To check if any element of the list is > 15. anyMatch is a predicate function.");
		boolean ans2 = ll.stream().anyMatch(s->s>15);
		System.out.println(ans2);
		System.out.println();
	}

}
