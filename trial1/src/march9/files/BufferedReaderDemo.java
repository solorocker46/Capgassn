package march9.files;
import java.io.*;
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		String r = br.readLine();
		while(r != null)
		{
			System.out.println(r);
			r = br.readLine();
		}
	}

}
