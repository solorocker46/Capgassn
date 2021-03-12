package Arrays;
import java.util.*;
class RemoveDuplicates
{
	int[] modifyArray(int myArray[])
	{
		List<Integer> arraylist = new ArrayList<Integer>();
		for(int i=0;i<myArray.length;i++)
		{
			arraylist.add(myArray[i]);
		}
		for(int i=0;i<arraylist.size();i++)
		{
			int temp = arraylist.get(i);
			for(int j=i+1;j<arraylist.size();j++)
			{
				if(temp == arraylist.get(j))
				{
					arraylist.remove(j);
				}
			}
		}
		Collections.sort(arraylist, Collections.reverseOrder());
		int myNewArray[] = new int[arraylist.size()];
		for(int i=0;i<arraylist.size();i++)
		{
			myNewArray[i] = arraylist.get(i);
		}
		return myNewArray;
	}
}
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nValue = scanner.nextInt();
		int myArray[] = new int[nValue];
		for(int i=0;i<nValue;i++)
		{
			myArray[i] = scanner.nextInt();
		}
		RemoveDuplicates removeduplicates = new RemoveDuplicates();
		int res[] = removeduplicates.modifyArray(myArray);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		System.out.println();
	}

}
