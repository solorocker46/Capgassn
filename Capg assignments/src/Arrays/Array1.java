package Arrays;
import java.util.*;
class SecondSmallest
{
	int returnSecondSmallest(int myArray[])
	{
		Arrays.sort(myArray);
		return myArray[1];
	}
	
}
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nValue = scanner.nextInt();
		int myArray[] = new int[nValue];
		for(int i=0;i<nValue;i++)
		{
			myArray[i] = scanner.nextInt();
		}
		SecondSmallest secsmall = new SecondSmallest();
		int result = secsmall.returnSecondSmallest(myArray);
		System.out.println("Second smallest element = "+result);
	}

}
