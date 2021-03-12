package fileHandling;
import java.io.*;
import java.util.*;
public class assn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		File file = new File(name);
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		String type = name.split("[.]")[1];
		System.out.println(type);
		long size = file.length();
		System.out.println(size+" bytes");
	}

}
