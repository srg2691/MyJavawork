package Myunderstanding;

public class BaseClass {
	
	String Base;
	
	public static void add(int a , int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public BaseClass(String Base)
	
	{
		this.Base=Base;
		System.out.println("Base class constructor");
		System.out.println(Base);
	}

}
