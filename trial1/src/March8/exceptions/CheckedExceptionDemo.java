package March8.exceptions;
import java.io.*;
public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		int a = 10;
		File f1 = new File("abc.txt");
		System.out.println(2 / 0);
		f1.createNewFile();
	}

}
