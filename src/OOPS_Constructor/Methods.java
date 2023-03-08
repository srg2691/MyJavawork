package OOPS_Constructor;

public class Methods {
	
	public Methods() {
		
		System.out.println("constructor called");
		
	
		
	}
	
	public void First() {
		System.out.println("first method called");
		
	}
	
	public int sum(int a, int b,int add) {
		add=a+b;
		System.out.println(" sum is "+add);
		return add;
	}
	public static int diff(int a,int b,int sub) {
		sub=a-b;
		System.out.println("differnece is "+sub);
		return sub;
		
	}

	public static void main(String[] args) {
		
		
		Methods m=new Methods();
		m.First();
		int addition=m.sum(5,10,0);
		int subtract=diff(10,9,0);
		System.out.println(" Sum is "+"  "+addition);
		System.out.println("difference is "+subtract);
		
		
		
		
		

	}

}
