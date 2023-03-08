package ExceptionHandling;

public class Throwsdemo {
	
	public void m1()
	{
		System.out.println("m1 method");
		m2();
		
	}

	public void m2(){
		System.out.println("m2 method");
		try
		{
		m3();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(" Arithmetic exception");
			e.printStackTrace();
		}
		
	}
	
	public void m3() throws ArithmeticException {
	
		System.out.println("m3 method");
		int a=10;
		int b=0;
		
		int c=a/b;//Arithmetic exception
	}
	public static void main(String[] args) {
		
		Throwsdemo th=new Throwsdemo();
		th.m1();
		//throws keyword is used to throw the exception from the method to another method
		//throw only throws the exception and doesnt handle it
		//actual exception handling is done by try catch block
		

	}

}
