package classTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(4, 7, -2, 8, -3, -11, 20);
		ArrayList<Integer> res = (ArrayList<Integer>) arr.stream().filter(e->e > 0 && e % 2 == 0).collect(Collectors.toList());
		System.out.println(res);
	}

}
