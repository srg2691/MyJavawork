package programs;

import java.util.Arrays;

public class Duplicates {

	
	public void Duplicate()
	{
		String arr[]= {"Sar","And","Selenium","Sar"};
		Arrays.asList(arr);
		int count=0;
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				
		
		{
			if(arr[i].equalsIgnoreCase(arr[j]))
			{
				System.out.println("Duplicate element is "+arr[j]);
			}
		}
		}
				
					
					
	}
		
		
	public static void main(String[] args) {
		
		Duplicates d=new Duplicates();
		d.Duplicate();
		
		

	}

}
