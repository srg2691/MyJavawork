package WebdriverArch;

public class ChromeDriver implements Webdriver{
	
	public ChromeDriver()
	{
		System.out.println(" Chrome is launched");
	}

	
	
	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
		System.out.println(" return the url "+url);
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		
		System.out.println(" Return the title ");
		return "title";
	}

	@Override
	public void click(String element) {
		// TODO Auto-generated method stub
		
		System.out.println(" clicking on element "+element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		// TODO Auto-generated method stub
		
		System.out.println(" entering value : "+value+" in "+element);
		
		
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
		System.out.println(" close browser");
		
	}

	@Override
	public void findElement(String element) {
		// TODO Auto-generated method stub
		System.out.println(" Find element "+element);
		
	}
	
	
	

}
