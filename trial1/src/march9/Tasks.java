package march9;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello");
		int len = s.length();
		System.out.println("===============Task1=================");
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("=================Task2============");
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'u')
			{
				
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
		System.out.println("========================Task3==================");
		for(int i=0;i<len;i++)
		{
				int count = 0;
				for(int j=i-1;j>=0;j--)
				{
					if(s.charAt(j) == s.charAt(i))
					{
						count = 1;
						break;
					}
				}
				if(count == 0)
				{
					System.out.print(s.charAt(i));
				}
			
		}
	}

	
}
