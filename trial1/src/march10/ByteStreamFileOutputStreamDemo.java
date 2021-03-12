package march10;
import java.io.*;
public class ByteStreamFileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("three.txt");
		int r = fis.read();
		while(r != -1)
		{
			System.out.print((char)r);
			r = fis.read();
		}
	}

}
