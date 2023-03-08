package Myunderstanding;

public class ChildClass extends BaseClass {
	
	public ChildClass()
	{
		super("base class data member");
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		
		BaseClass b=new ChildClass();
		b.add(5, 7);
		

	}

}
