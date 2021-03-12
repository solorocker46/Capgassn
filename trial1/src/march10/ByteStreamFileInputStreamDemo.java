package march10;
import java.io.*;
public class ByteStreamFileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("three.txt");
		fos.write(67);
		fos.write('a');
		String s = "hello";
		byte arr[] = s.getBytes();
		fos.write(arr);
		fos.write(arr, 2, 2);
		fos.flush();
		fos.close();
	}

}
