package StringBuild;

public class StringReverse {
	
	
	//WAP to reverse a String 
	//input is a string and program should give the reverse of it
	
	public static void reverseString()
	{
		String name="Selenium";
		int len=name.length();//8
		
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			 rev=rev+name.charAt(i);//muineleS
		}
		
		System.out.println(rev);
	}

	
	public static String reverseStringname(String names)//logic when program will reverse string given by user
	{
		
		if(names==null)//null check to avoid NPE, first statement to avoid NPE when length method is ran
		{
			System.out.println("null is not  allowed");
			return null;
		}
		
		
		int length=names.length();
		String reverse="";
		
	
		
		
		if(length==1)//checking if string is single character (length =1)
		{
			return names;
		}
		
		for(int j=length-1;j>=0;j--)
		{
			reverse=reverse+names.charAt(j);
			
		}
		
		return reverse;
	}
	public static void main(String[] args) {
		
		reverseString();
		String r1=reverseStringname("Sarang");
		System.out.println(r1);
		
		r1=reverseStringname("Sarang Anand");
		System.out.println(r1);
		
		r1=reverseStringname("2456434");
		System.out.println(r1);
		
		r1=reverseStringname("N");//reversing single char will give same char
		System.out.println(r1);
		
		r1=reverseStringname(null);//null check
		System.out.println(r1);

		r1=reverseStringname("tt");
		System.out.println(r1);
		
		
		
		
		
		

	}

}
