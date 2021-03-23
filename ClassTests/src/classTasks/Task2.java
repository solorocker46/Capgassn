package classTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Apple", "Orange", "Banana", "Mango", "Strawberry", "Watermelon");
		long count = list.stream().filter(e->e.length() > 5).count();
		System.out.println("Count of strings > 5 = "+count);
		System.out.println("================Sort in ascending=========================================");
		list.stream().sorted().forEach(s->System.out.println(s));
		System.out.println("===================Sort in descending========================================");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		System.out.println("===================Starts with a=============================================");
		List<String> resList = list.stream().filter(e->e.toLowerCase().startsWith("a")).collect(Collectors.toList());
		resList.forEach(System.out::println);
		
	}

}
