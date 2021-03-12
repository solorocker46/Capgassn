package day3;
class Shopping
{
	void search()
	{
		System.out.println("This is default search");
	}
	void search(int modelNo)
	{
		System.out.println("Seraching with model number = "+modelNo);
	}
	void search(int modelNo, String brandName)
	{
		System.out.println("Seraching with model number = "+modelNo);
		System.out.println("Brand name = "+brandName);
	}
	void search(String brandName)
	{
		System.out.println("Seraching with brand name = "+brandName);
	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping shopping = new Shopping();
		shopping.search();
		shopping.search(234);
		shopping.search(256, "Samsung");
		shopping.search("Apple");
	}

}
