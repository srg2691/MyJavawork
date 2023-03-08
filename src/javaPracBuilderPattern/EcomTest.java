package javaPracBuilderPattern;

public class EcomTest {
	
	

	public static void main(String[] args) {
		EcomApp e=new EcomApp();//object created
		
		// calling multiple methods of same class as all are part of single object
		//return this would return the current class object
		
		e.login("Sarang", "Sarang@123")
		.doSearch("Airpods", 4500, "Apple")
		.addToCart("Airpods")
		.doPayment("1234 2345 4567 8901", 876)
		.generateOrder()
		.logOut();

		//---------------------------------//
		System.out.println("-------------------------------");
		//user can come and use the same object with different functionality
		e.login()
		.doSearch("Nike tshirt")
		.addToCart("Nike tshirt")
		.logOut();
		
		e.addToCart("Nike tshirt")
		.doPayment("saranganand2691")
		.generateOrder()
		.logOut(); 
		
		//each new user will create new object and use the application
		EcomApp e1=new EcomApp();
	}

}
