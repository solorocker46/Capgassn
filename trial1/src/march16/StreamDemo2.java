package march16;

import java.util.ArrayList;

public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(10);
		a.add(24);
		a.add(5);
		System.out.println("Before sorting");
		a.forEach(s->System.out.println(s));
		System.out.println("After sorting");
		a.stream().sorted().forEach(s->System.out.println(s));
		System.out.println();
		ArrayList<String> names = new ArrayList<>();
		names.add("Sid");
		names.add("Sushma");
		names.add("Jai");
		names.add("Ansh");
		System.out.println("Before sorting");
		names.forEach(s->System.out.println(s));
		System.out.println("After sorting");
		names.stream().sorted().forEach(s->System.out.println(s));
	}

}
