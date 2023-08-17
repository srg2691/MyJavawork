package programs;

public class GetTotalwordsinCapitalizedString {

	public static void main(String[] args) {
		
		String str="NaveenAutomaRRtionLabsYoutube";
		
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		//ASCII Values
		
           int count1=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				count1++;
			}
		}
		System.out.println(count);

	}

}
