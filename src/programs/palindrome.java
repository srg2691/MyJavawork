package programs;

public class palindrome {
	
	public void palindro(String p)
	{
		System.out.println(" String entered by user is "+p);
		
		String forward="";
		String back="";
		
		int len=p.length();
		
		for(int i = 0 ; i<=len-1;i++)
		{
			forward= forward+p.charAt(i);
		}
		
		for(int j = len-1 ; j>=0;j--)
		{
			back= back+p.charAt(j);
		}
		
		if(forward.equalsIgnoreCase(back))
		{
			System.out.println(" String is a palendrome");
		}
		
		else
		{
			System.out.println(" String is not a palendrome");
		}
		
	}

	public static void main(String[] args) {
		
		palindrome pr= new palindrome();
		pr.palindro("Sarang");
		
		pr.palindro("Naman");

	}

}
