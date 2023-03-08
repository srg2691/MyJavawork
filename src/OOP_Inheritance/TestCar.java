package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.start();//overriden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		
		System.out.println("-----------");
		
		Car c=new Car();
		c.start();
		c.stop();c.refuel();
		System.out.println("-------------");
		
		
		//child calss object can be referred by parent class reference varaible
		//upcasting
		
		Car c1=new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.autoParking(); - - this is not allowed as it fails the reference type check
		
		//DOWNcasting
		
		BMW b1= (BMW) new Car();// Class Cast exception at run time, no error on compile time

	}

}
