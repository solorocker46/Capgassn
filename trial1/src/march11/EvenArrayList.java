package march11;
import java.util.*;
public class EvenArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input 10 numbers");
		for(int i=0;i<10;i++)
		{
			int num = scanner.nextInt();
			if(num % 2 == 0)
			{
				myList.add(num);
			}
		}
		System.out.println(myList);
	}

}
