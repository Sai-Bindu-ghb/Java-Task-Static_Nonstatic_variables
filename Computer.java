public class Computer
{
	public static String os="Windows";
	String ram;

	public static void main(String args[])
	{

		System.out.println("os:"+Computer.os);
		Computer com1=new Computer();
		com1.ram="8 GB";
		System.out.println("Computer 1:"+com1.ram);
		Computer com2=new Computer();
		com2.ram="16 GB";
		System.out.println("Computer 2:"+com2.ram);
		
	}
}
		