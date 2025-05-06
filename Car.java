public class Car
{
	public static String companyName = "Honda";
	String carModel= "civic";

	public static void main(String args[])
	{
		System.out.println("Company"+Car.companyName);
		Car car=new Car();
		System.out.println("Car 1 Model:"+car.carModel);
		Car car1=new Car();
		car1.carModel="Accord";
		System.out.println("Car 2 Model:"+car1.carModel);
	}
}
		