package ExceptionHandling;

public class ThrowCustomException {

	public static void main(String[] args) {
		
		String browser=null;
		
		if(browser==null)
		{
			try {
			throw new Exception("browser not found");//throw keyword is used to throw custom exception
		}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			
	}
		else {
			System.out.println(" browser is launched");
		}

}
}
