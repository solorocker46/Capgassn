package day2.assn;

public class arraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 5, 9, 4};
		int totsum = 0, oddsum = 0, evensum = 0;
		for(int i=0;i<a.length;i++)
		{
			totsum += a[i];
			if(a[i] % 2 == 0)
			{
				evensum += a[i];
			}
			else
			{
				oddsum += a[i];
			}
		}
		System.out.println("Total sum = "+totsum);
		System.out.println("Total sum = "+oddsum);
		System.out.println("Total sum = "+evensum);
	}

}
