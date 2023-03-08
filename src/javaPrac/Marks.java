package javaPrac;

public class Marks {
	
	public int grading(int m) {
		
		System.out.println(" Enter the marks "+m);
		
		if(m>100)
		{
			System.out.println("Invalid marks");
		}
		
		if(m>=91 && m<=100)
		{
			System.out.println(" Student has scored grade AA");
			
		}
		
		else if(m>=81 && m<=90)
		{
			System.out.println(" Student has scored grade AB");
		}
		
		else if(m>=71 && m<=80)
		{
			System.out.println(" Student has scored grade BB");
		}
		
		else if(m>=61 && m<=70)
		{
			System.out.println(" Student has scored grade BC");
		}
		
		else if(m>=51 && m<=60)
		{
			System.out.println(" Student has scored grade CD");
		}
		
		else if(m>=41 && m<=50)
		{
			System.out.println(" Student has scored grade DD");
		}
		
		else if(m<=40)
		{
			System.out.println(" Student has failed");
		}
		
		return m;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marks g=new Marks();
		int result=g.grading(50);
		
		

	}

}
