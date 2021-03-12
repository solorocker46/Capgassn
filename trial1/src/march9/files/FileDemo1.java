package march9.files;
import java.io.*;
public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\Capgemini training\\Module 1\\Core Java 8+Database&SQL+JDBC\\PDF\\abc.txt");
		if(f.exists())
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not present");
			System.out.println("I'll create a new file now");
			f.createNewFile();
		}
	}

}
