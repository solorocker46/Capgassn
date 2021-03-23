package classTasks;
class InvalidCountryException extends Exception
{
	public InvalidCountryException(String msg)
	{
		super(msg);
	}
}
class UserRegistration
{
	void registerUser(String username, String country) throws InvalidCountryException
	{
		if(country.equalsIgnoreCase("India"))
		{
			System.out.println("User registration done successfully");
		}
		else
		{
			throw new InvalidCountryException("User outside India cannot be registered");
		}
	}
}
public class ExceptionTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration registration = new UserRegistration();
		try {
			registration.registerUser("SushmaS", "america");
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
