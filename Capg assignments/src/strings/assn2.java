package strings;
import java.util.*;
class StringMirrorImage
{
	String getImage(String myString)
	{
		String tempString = myString;
		StringBuffer sb = new StringBuffer(myString);
		sb.append("|");
		StringBuffer sb1 = new StringBuffer(myString);
		sb1.reverse();
		sb.append(sb1);
		myString = sb.toString();
		return myString;
	}
}
public class assn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		StringMirrorImage mirrorimage = new StringMirrorImage();
		String myString = scanner.nextLine();
		myString = mirrorimage.getImage(myString);
		System.out.println(myString);
	}

}
