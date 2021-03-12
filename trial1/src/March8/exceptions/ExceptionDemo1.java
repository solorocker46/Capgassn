package March8.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bangalore");
		System.out.println("50 kms");
		System.out.println("100 kms");
		try
		{
			System.out.println(2/0);
		}
		catch(Exception e)
		{
			System.out.println("Not possible due to "+e);
		}
		System.out.println("200 kms");
		System.out.println("250 kms");
		System.out.println("Chennai");
	}

}
