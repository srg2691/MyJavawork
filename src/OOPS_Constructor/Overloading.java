package OOPS_Constructor;

public class Overloading {
	
	int a;
	int b;
	int c;
	
	
	public Overloading() {
		
		a = a;
		b = b;
		c = c;
		System.out.println(a+" "+b+" "+c);
	}

	public int sum(int a,int b)
	{
		int sum=a+b;
		return sum;
	}

	public double sum(double a,double b, double c)
	{
		double sum=a+b+c;
		return sum;
	}
	
	public static double sum(int a,int b, double c)
	{
		double sum=a+b+c;
		return sum;
	}
	
	
	

}
