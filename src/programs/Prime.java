package programs;

public class Prime {
	
	public static void primeno(int n)
	{
		
		if(n==1)
		{
			System.out.println(n+" is not prime nor composite");
		}
		else if(n%2==0)
		{
			System.out.println(" Number is not prime");
		}
		
		else 
		{
			System.out.println(" Number is prime");
		}
	}
	
	public static void main(String[] args) {
		
		primeno(23);
		
		
	}

}
