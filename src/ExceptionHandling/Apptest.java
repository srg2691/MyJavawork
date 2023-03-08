package ExceptionHandling;

public class Apptest {

	public static void main(String[] args) {
		
		String data=null;
		if(data==null)
		{
			throw new ApplicationExceptions("Data not found");
			//in above statement we are calling the APplication exception class constructor
			//which will call the parent class constructor 
			//which will inturn call its parent class const--Exception class const
		}

	}

}
