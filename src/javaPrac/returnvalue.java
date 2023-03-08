package javaPrac;

public class returnvalue {
	
	public int returnSum(int a,int b){
		
		int sum =a+b;
		System.out.println("Sum of two numbers is "+sum);
		return sum;
	}
	
	public double returnMultipy(int c, double d) {
		
		double multiply=c*d;
		System.out.println("The product of two number is "+multiply);
		return multiply;
		
	}
	
	
	public double circle(double e) {
		
		double circum= 2*e*2.14;
		System.out.println("circumference of a circle with radius "+e+" "+"is "+circum);
		return circum;
	}
	
	public double area(double f) {
		
		double areacircle=2.14*(f*f);
		System.out.println("area of a circle with radius "+f+" "+"is "+areacircle);
		return areacircle;
	}
//------------------------------------------------------------------------------------
	public int max(int g,int h,int i) {
		
		if(g>h && g>i)
		{
			System.out.println(g+" if the greatest number");
			return g;
		}
		else if (h>g && h>i)
		{
			System.out.println(h+" is the greatest number");
			return h;
		}
		
		else
		{
			System.out.println(i+" is the greatest number");
			return i;
		}
			
		}
		
	//----------------------------------------------------------------------------	
		
		public int min(int j,int k,int l) {
			
			if(j<k && j<l)
			{
				System.out.println(j+" is the smallest number");
				return j;
			}
			else if (k<j && k<l)
			{
				System.out.println(k+" is the smallest number");
				return k;
			}
			
			else
			{
				System.out.println(l+" is the smallest number");
				return l;
				
			}
		}
		//--------------------------------------------------------------------------------------
			
			public int number(int z) {
				
				System.out.println("The given number is "+z);
				
				if(z%2==0)
				{
					System.out.println(z+" is an even number");
					
				}
				else
				{
					System.out.println(z+" is an odd number");
				}
				return z;
			}
				
		//------------------------------------------------------------------------------------	
			
		
		
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		returnvalue r= new returnvalue();
		r.returnSum(20, 30);
		
		r.returnMultipy(20, 456.12);
		r.circle(23.2);
		r.area(22.1);
		r.max(10,20,30);
		r.min(12, 67, 98);
		r.number(34);
		

	}

}
