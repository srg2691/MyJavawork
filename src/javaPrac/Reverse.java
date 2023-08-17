package javaPrac;

public class Reverse {
	
	
	public void Reversing(String str)
	
	{
		String rev="";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}

	public static void main(String[] args) {
		
		Reverse r=new Reverse();
		r.Reversing("Sarang");
		

	}

}
