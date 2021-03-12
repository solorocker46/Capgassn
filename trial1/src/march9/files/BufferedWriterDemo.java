package march9.files;
import java.io.*;
public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter brw = new BufferedWriter(new FileWriter("abc.txt"));
		brw.write("Hello");
		brw.newLine();
		brw.write("Java");
		brw.newLine();
		brw.write("Thanks");
		brw.flush();
		brw.close();
	}

}
