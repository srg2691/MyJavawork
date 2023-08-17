package programs;

import java.util.Arrays;

public class catdog {

	public static void main(String[] args) {

		boolean isit=iscatdog();
		System.out.println(isit);
		

	}

	public static boolean  iscatdog()


	{

		int countcat=0;
		int countdog=0;

		String str=" This is a string cat string dog dog cat cat to return catdog catdog  dog cat dog";
		int count=0;
		
		String [] split=str.split(" ");
		
		
		System.out.println(Arrays.toString(split).trim());
		
		
		for(int i=0;i<=split.length-1;i++)
		{
			if(split[i].equals("cat"))
			{
				countcat++;
			}
			
			else if(split[i].equals("dog"))
			{
				countdog++;
			}
			
			else if(split[i].equals("catdog")|| split[i].equals("dogcat"))
			{
				countdog++;
				countcat++;
			}
			
			
		}
				
		System.out.println(" cat count is  "+countcat);
		
		System.out.println(" dog count is  "+countdog);
				
		
		if(countcat==countdog)
		{
			return true;
		}
		
		else {
			return false;
		}
	}
}

