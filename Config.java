public class Config
{
	public static String configName="System Config";
	String settingValue;

	public static void main(String args[])
	{

		System.out.println("Config Name:"+Config.configName);
		Config config=new Config();
		config.settingValue="Dark Mode";
		System.out.println("Setting 1:"+config.settingValue);
		Config config1=new Config();
		config1.settingValue="Light Mode";
		System.out.println("Setting 2:"+config.settingValue);
		
	}
}
		