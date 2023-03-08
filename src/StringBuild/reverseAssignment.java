package StringBuild;

public class reverseAssignment {
	
	public static int reverse(int i)
	
	
	{
		
		String str=String.valueOf(i);
		//System.out.println(str);
		
		
		if(str==null)//null check to avoid NPE, first statement to avoid NPE when length method is ran
		{
			System.out.println("null is not  allowed");
			
		}
		
		int len=str.length();
		if(len==1)
		{
			System.out.println("single character string");
		}
		
		
		
		String rev="";
		
		for(int j=len-1;j>=0;j--)
		{
			rev=rev+str.charAt(j);
			
		}
		
		int x=Integer.parseInt(rev);
		
		return x;
	
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		int result=reverse(987654321);
		System.out.println(result);
		
		result=reverse(6);
		System.out.println(result);
		
		result=reverse(0);
		System.out.println(result);
		
		
		
		//take 123 as integer parameter, convert to string and print its reverse
	}

}
