package random;
import java.util.*;
@FunctionalInterface
interface Authenticate
{
	boolean authenticate(String correctUsername, String correctPass, String username, String pass);
}
class Credentials
{
	private String username;
	private String pass;
	public Credentials(String username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
public class assn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		String password = scanner.nextLine();
		Credentials cred = new Credentials("User@123", "MyPass");
		Authenticate auth = (actualUser, actualPasswd, User, Pass) ->
		{
			if(actualUser.equals(User) && actualPasswd.equals(Pass))
			{
				return true;
			}
			return false;
		};
		if(auth.authenticate(cred.getUsername(), cred.getPass(), username, password))
		{
			System.out.println("Authentication successful");
		}
		else
		{
			System.out.println("Incorrect username or password");
		}
	}

}
