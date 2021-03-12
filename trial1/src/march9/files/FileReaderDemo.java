package march9.files;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("abc.txt");
		int r = fr.read();
		while(r != -1)
		{
			System.out.print((char)r);
			r = fr.read();
		}
	}

}
