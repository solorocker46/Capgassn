package march9.files;
import java.io.*;
public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.write(123);
		pw.print("ccc");
		pw.flush();
	}

}
