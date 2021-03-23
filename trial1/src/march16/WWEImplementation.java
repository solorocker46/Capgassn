package march16;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WWEImplementation {

	List<String> printFirstNamesList(List<WWE> ll)
	{
		List<String> fname = ll.stream().map(e->e.getFirstName()).collect(Collectors.toList());
		return fname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<WWE> wwelist = new ArrayList<>();
		wwelist.add(new WWE("Sid", "Bharadwaj", 250));
		wwelist.add(new WWE("Jai", "Vashishtha", 57));
		wwelist.add(new WWE("Prithvi", "S", 280));
		wwelist.add(new WWE("Raghav", "Prasad", 278));
		wwelist.add(new WWE("Ashish", "Chawla", 98));
		long countValue = wwelist.stream().count();
		System.out.println("Count of wrestlers = "+countValue);
		int sum =  wwelist.stream().filter(e->e.getWeight() > 200).mapToInt(e->e.getWeight()).sum();
		System.out.println("Sum of weights = "+sum);
		WWEImplementation wwe = new WWEImplementation();
		wwe.printFirstNamesList(wwelist).forEach(s->System.out.println(s));
	}

}
