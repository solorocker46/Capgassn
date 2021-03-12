package strings;
import java.io.*;
public class assn5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sushma S\\Documents\\CapgJA7\\Capg assignments\\src\\fileHandling\\sample.txt"));
		String r = br.readLine();
		int wordCount = 0, lineCount = 0, charCount = 0;
		while(r != null)
		{
			charCount += r.length();
			String arr[] = r.split(" ");
			wordCount += arr.length;
			lineCount++;
			r = br.readLine();
		}
		System.out.println("Character count = "+charCount);
		System.out.println("Word count = "+wordCount);
		System.out.println("Line count = "+lineCount);
	}

}
