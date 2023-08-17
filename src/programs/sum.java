package programs;

public class sum {
	
	public boolean summing(int a,int b,int c)
	{
		 int sum=a+b;
		if(sum==c)
		{
			System.out.println(" Sum is equal to third integer");
			
			return true;
		}
		
		else {
			System.out.println(" sum is not equal to third integer");
		}
		return false;

	}

	public static void main(String[] args) {
		
		sum s=new sum();
		s.summing(10, 20,30);

	}

}
