package AccessModifier1;

public class Car {

	
	public String name;
	
	private int price;
	
	protected String color;
	
	String seller;//default access modifier
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.price=100;
		c.color="Red";
		c.name="BMW";
		c.seller="Bavaria";
		

	}

}
