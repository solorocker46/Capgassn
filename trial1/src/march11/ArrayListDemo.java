package march11;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Merge the 2 lists, remove duplicates and sort it
		List<String> project1 = new ArrayList<>();
		project1.add("Sachin");
		project1.add("Rahul");
		project1.add("Amit");
		project1.add("Kumar");
		List<String> project2 = new ArrayList<>();
		project2.add("Roshan");
		project2.add("Varsha");
		project2.add("Rahul");
		project2.add("Amit");
		project2.add("Harshit");
		//System.out.println(project1);
		/*for(String name:project2)
		{
			if(!project1.contains(name))
			{
				System.out.println(name);
			}
		}*/
		project1.removeAll(project2);
		project1.addAll(project2);
		System.out.println(project1);
		Collections.sort(project1);
		System.out.println(project1);
	}

}
