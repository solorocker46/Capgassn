package March8;
interface Vehicle
{
	int speedLimit = 200;
	void noOfWheels();
}
interface Engine
{
	int speedLimit = 180;
	void engine();
}
class TestDrive
{
	void drive()
	{
		System.out.println("Driving");
	}
}
class Car extends TestDrive implements Vehicle, Engine
{
	public void noOfWheels()
	{
		System.out.println("4 wheels");
	}
	public void engine()
	{
		System.out.println("Petrol engine");
		System.out.println("SpeedLimit for vehicle = "+Vehicle.speedLimit);
		System.out.println("SpeedLimit for engine = "+Engine.speedLimit);
	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.noOfWheels();
		car.engine();
		car.drive();
	}

}
