package programs;

public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseNum(23456);

	}
	
	
	public static void reverseNum(int n)
	{
		
		int reverse=0;
		int remainder=0;
		
		while(n!=0)
		{
			  remainder = n % 10;
		      reverse = reverse * 10 + remainder;
		      n=n / 10;
		}
		
		System.out.println(reverse);
	}

}
