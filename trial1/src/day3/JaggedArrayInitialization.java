package day3;

public class JaggedArrayInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8}, {9, 10, 11, 12}, {13}};
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
