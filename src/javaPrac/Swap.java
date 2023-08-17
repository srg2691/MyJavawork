package javaPrac;

public class Swap {

	public void swapping(int a, int b) {

		System.out.println(" swapped values are  " + a + " and  " + b);
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println(" swapped values are  " + a + " and  " + b);

	}
	
	
	public void swapnothirdvariable(int a , int b)
	
	{
		
		System.out.println(" original  values are  " + a + " and  " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(" swapped values are  " + a + " and  " + b);
		
		
	}

	public static void main(String[] args) {

		Swap a = new Swap();
		//a.swapping(5, 50);
		a.swapnothirdvariable(3, 9);

	}

}
