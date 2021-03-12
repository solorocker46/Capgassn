package collectionFrameworks;
import java.util.*;
class ComputeSquares
{
	Map<Integer, Long> getSquares(int arr[])
	{
		Map<Integer, Long> squares = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			squares.put(arr[i], (long)arr[i]*arr[i]);
		}
		return squares;
	}
}
public class assn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		ComputeSquares cs = new ComputeSquares();
		Map<Integer, Long> res = cs.getSquares(arr);
		System.out.println(res);
	}

}
