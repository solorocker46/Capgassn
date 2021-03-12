package march11;
import java.util.*;
class Product
{
	int pid;
	String pname;
	int price;
	public Product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
}
public class UserDefinedType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> product = new ArrayList<>();
		product.add(new Product(1, "Mixer", 20000));
		product.add(new Product(2, "Grinder", 40000));
		product.add(new Product(3, "Soap", 250));
		product.add(new Product(4, "Handwash", 180));
		product.add(new Product(5, "Sanitizer", 150));
		Iterator<Product> it = product.iterator();
		while(it.hasNext())
		{
			Product p = it.next();
			if(p.price < 200)
			{
				System.out.println("Pid = "+p.pid+" Pname = "+p.pname+" Price = "+p.price);
			}
		}
	}

}
