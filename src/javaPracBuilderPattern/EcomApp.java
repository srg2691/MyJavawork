package javaPracBuilderPattern;

public class EcomApp {
	
	public EcomApp login()
	{
		System.out.println(" loginto app");
		return this;
		
	}
	
	public EcomApp login(String un, String pwd)
	{
		System.out.println(" loginto app"+un+" : "+pwd);
		return this;
	}
	
	public EcomApp doSearch(String productName)
	{
		System.out.println(" search product "+productName);
		return this;
	}
	
	public EcomApp doSearch(String productName, int price)
	{
		System.out.println(" search product with price"+productName+" "+price);
		return this;
	}
	
	public EcomApp doSearch(String productName, int price, String brand)//return type has to be class name, if method is returning 'this'
	{
		System.out.println(" search product with price and brand"+productName+" "+price+" "+brand);
		return this;//this will return the current class object
	}
	
	public EcomApp addToCart(String productname)
	{
		System.out.println("Add to Cart");
		return this;
	}
	
	public EcomApp doPayment(String cc, int cvv)
	{
		System.out.println(" paid with cc"+cc+" "+cvv);
		return this;
	}
	
	public EcomApp doPayment(String upi)
	{
		System.out.println("paid with upi "+upi);
		return this;
	}
	
	public EcomApp doPayment(String paypalid, String pwd)
	{
		System.out.println("Paid with paypal "+paypalid+" "+pwd);
		return this;
	}
	
	public EcomApp generateOrder()
	{
		System.out.println(" Order number is"+12345);
		return this;
	}
	
	public EcomApp logOut()
	{
		System.out.println("Logout");
		return this;
	}

}
