package javaPrac;

public class Overload {
	
	public boolean Login(long ph, String pwd) {
		
		System.out.println(" you have logged in with phone and password");
		return true;
		
	}
	
	public boolean Login(long ph, double otp) {
		
		System.out.println(" you have logged in with phone and otp");
		return true;
		
	}
	
	public boolean Login(String user,String pwd) {
		
		System.out.println(" you have logged in with user name and password");
		return true;
		
	}

	public boolean Login(String user, String pwd, int otp)
	{
		System.out.println(" You have logged in with username password and otp");
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overload o=new Overload();
		o.Login(999, "Hello");
		
	}

}
