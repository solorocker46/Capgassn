package march27;
/*
 * This is internal defn of enum
class day
{
	public static final day sun = new day();
	public static final day tues = new day();
	public static final day wed = new day();
}*/
enum days
{
	sun(4), mon(4), tue(3), wed(1), thu(5), fri(2), sat(3);
	int hours;

	private days(int hours) {
		this.hours = hours;
	}

	public int getHours() {
		return hours;
	}
	
	
};
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(days day : days.values())
		{
			System.out.println(day);
		}
		System.out.println("Switch demo");
		days d = days.mon;
		switch(d)
		{
		case mon: System.out.println(d.getHours());
		break;
		case tue: System.out.println(d.getHours());
		break;
		}
	}

}
