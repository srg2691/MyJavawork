package programs;

public class stringReverse {
	

	
	public String reverse(String str)
	{
		System.out.println(" String entered by user is "+str);
		String rev="";
		
		int length= str.length()-1;
		
		
		
		for(int i=length;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
				
		}
		
		System.out.println(" Reversed String is "+rev);
		
		return rev;
	}

	public static void main(String[] args) {
		
		stringReverse r=new stringReverse();
		r.reverse("Sarang");
	
		
	

	}

}
