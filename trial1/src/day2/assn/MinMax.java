package day2.assn;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 5, 9, 4};
		int min = a[0], max = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("Min element = "+min);
		System.out.println("Max element = "+max);
	}

}
