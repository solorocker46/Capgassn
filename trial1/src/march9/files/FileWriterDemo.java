package march9.files;
import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("abc.txt", true);
		fw.write("lallalallalajfekfjek");
		fw.write("Lalalalala");
		fw.write("HelloWelcome\n");
		fw.write(67+"\n");
		fw.write("Welcome");
		fw.flush();
		fw.close();
	}

}
