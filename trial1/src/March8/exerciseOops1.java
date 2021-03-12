package March8;
class Car1
{
	private int yearModel;
	private String make;
	private int speed;
	Car1(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
		this.speed = 0;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getField() {
		return speed;
	}
	public void setField(int field) {
		this.speed = speed;
	}
	void accelerate()
	{
		speed += 5;
	}
	void brake()
	{
		if(speed == 0)
		{
			speed = 0;
			return;
		}
		speed -= 5;
	}
}

public class exerciseOops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car = new Car1(1965, "Bat Mobile");
		for(int i=0;i<5;i++)
		{
			car.accelerate();
			System.out.println(car.getField());
		}
		System.out.println("==================================================");
		for(int i=0;i<5;i++)
		{
			car.brake();
			System.out.println(car.getField());
		}
	}

}
