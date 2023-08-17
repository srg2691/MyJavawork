package programs;

public class SumandMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int additon=sum(123);
		System.out.println(additon);
		
		int additon1=sum(456);
		System.out.println(additon1);
		
		
		int product=product(555);
		System.out.println(product);

	}
	
	
	public static int sum(int n)
	{
		int sum=0;
		int digit=0;
		
		while(n!=0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		
		return sum;
	}
	
	
	public static int product(int n)
	{
		int digit;
		int prod=1;
		
		while(n!=0)
		{
			digit=n%10;
			prod=prod*digit;
			//System.out.println(prod);
			n=n/10;
		}
		
		return prod;
	}

}
