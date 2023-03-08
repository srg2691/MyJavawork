package WebdriverArch;

public class test {
	
	static Webdriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chrome
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//SafariDriver driver=new SafariDriver();
		//cross browser logic
		String browser="chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();//top casting / upcasting
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
		}
		
		else {
			System.out.println(" please pass correct browser");
		}
		
		driver.get("www.google.com");
		String actualTitle=driver.getTitle();
		
		System.out.println(" Page title is "+actualTitle);
		if(actualTitle.equals("Google"))
		{
			System.out.println(" title is correct");
		}
		else
		{
			System.out.println(" incorrect tile");
		}
		
		driver.sendKeys("email", "sarang");
		driver.click("login");
		driver.close();
		
		
	}

}
