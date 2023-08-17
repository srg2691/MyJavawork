package programs;

public class Conversion {
	
	public int Convert(String s)
	{
		int a=Integer.parseInt(s);
		System.out.println("converted int value is "+a);
		
		return a;
	}
	
	public void convertback(int a)
	{
		String str=String.valueOf(a);
		System.out.println(" converted string value is"+str);
		int len=str.length();
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
	}

	public static void main(String[] args) {
		
		Conversion c=new Conversion();
		c.Convert("123");
		c.convertback(543);
		

	}

}
