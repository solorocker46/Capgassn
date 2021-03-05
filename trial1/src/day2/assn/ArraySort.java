package day2.assn;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 5, 9, 4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j+1] < a[j])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("The sorted array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
