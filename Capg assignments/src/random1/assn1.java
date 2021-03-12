package random1;
import java.io.*;

public class assn1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sushma S\\Documents\\CapgJA7\\Capg assignments\\src\\fileHandling\\sample.txt"));
		String r = br.readLine();
		int count = 1;
		while(r != null)
		{
			System.out.println(count+" "+r);
			count++;
			r = br.readLine();
		}
	}

}
