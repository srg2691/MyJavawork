package programs;

public class hybridsum {
	
	public void divisible()
	{
		int count=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println("Divisble by 3");
				System.out.println(i);
			}
			
			else if(i%5==0)
			{
				System.out.println("Divisble by 5");
				System.out.println(i);
			}
			
			else if(i%3==0 && i%5==0)
			{
				System.out.println("Divisble by 3 and 5");
				System.out.println(i);
			}
			
			else {
				i++;
			}
		}
	}
	public static void main(String[] args) {
		
		hybridsum h= new hybridsum();
		h.divisible();
		

	}

}
