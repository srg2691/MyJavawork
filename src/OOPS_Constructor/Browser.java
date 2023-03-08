package OOPS_Constructor;

public class Browser {

	
	public void launchBrowser()
	{
	
		System.out.println("Launch browser");
		checkRAM();
		checkVersion();
		CheckOS();
		checkBrwoserServices();
		
		//by calling all methods in a single method, we are hiding the unnecessary processing from the user , 
		//which is not relevant to end user - this is also encapsulation
		//Not only security aspect , but good programming aspect as well is fulfilled by encapsulation
		
		System.out.println(" browser is launched");
		
	}
	
	public void checkRAM()
	{
		System.out.println("check the RAM");
	} 
	
	public void checkVersion()
	{
		System.out.println("check the version");
	}
	
	public void CheckOS()
	{
		System.out.println(" Check OS");
	}
	
	public void checkBrwoserServices()
	{
		System.out.println(" check services");
	}
	
	// we should encapsulate methods since user doesnt want to see the internal processing done by the system
	//for the launch of the browser 
	
	
	public static void main(String[] args) {
		Browser b=new Browser();
		b.launchBrowser();
	}
}
