package ExceptionHandling;

public class ExceptHandle {
	
	

	public static void main(String[] args) {

		
		System.out.println("program start");
		
		try {
		int i=9/0;
		}
		
		catch(Throwable e){// can use Exception class or specific exception class like AE
			//Throwable class is parent of Exception class
			System.out.println(" Arithmetic Exception");
			e.printStackTrace();
			
		}
		
		finally {
			System.out.println(" Exception Handled");
			
			//finally block can have another try--catch block inside it
			//whatever is written in finally block will be followed
			//method will return whatever is there in finally block
		}
		
		System.out.println("program end");
	}

}
