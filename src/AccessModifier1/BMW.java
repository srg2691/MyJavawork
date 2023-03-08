package AccessModifier1;

public class BMW extends Car {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BMW b=new BMW();
		b.color="Blue";
		//b.price=100; //- cannot access private variable in subclass, same package
		
	}

}
