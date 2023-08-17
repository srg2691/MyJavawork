package javaPrac;

public class Arrays {
	
	
	
	public void traverse()
	{
		int a[]= {11,12,13,14};
		for(int e :a)
		{
			System.out.println(e);
		}
		
	}
	
	public void Objarrary()
	{
		Object obj[]=new Object[] {"Sarang",32};
		for(Object o:obj)
		{
			System.out.println(o);
		}
		
		
	}
	
	

	public static void main(String[] args) {
		Arrays ar=new Arrays();
		ar.traverse();
		ar.Objarrary();
		
		

	}

}
