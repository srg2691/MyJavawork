package javaPrac;

public class Prime {
	
	public int num(int number) {
		
		System.out.println(" the number entered is "+number);
		if(number<=1)
		{
			System.out.println(number+" is not a prime number");
			
		}
		else if(number%2==0)
		{
			System.out.println(number+" is not a prime number");
		}
		
		else {
			System.out.println(number+" is a prime number");
		}
		
		return number;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prime p=new Prime();
		int z=p.num(34);

	}

}
