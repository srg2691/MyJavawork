package programs;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		isarmstrong(153);
		isarmstrong(476);
		
		
	}
	
	
	public static void isarmstrong(int n)
	{
		int orignum=n;
		
		int sum=0;
		
		int remainder=0;
		
		while(n>0)
		{
			remainder=n%10;
			n=n/10;
		
			sum=sum+(remainder*remainder*remainder);
			
		}
		
		if(orignum==sum)
		{
			System.out.println(" number is an armstrong number");
		}
		
		else {
			System.out.println(" Number is not armstrong");
		}
	}
	
}
	
	