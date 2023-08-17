package programs;

import java.util.Arrays;

public class MaxlengthString {

	public static void main(String[] args) {
		
		String longest=LongestString();
	System.out.println(longest);
	}
	
	public static String LongestString()
	{


		String str=" This is a class of Physics and Chemistry";
		
		String[] arr=str.split(" ");
		
		String str2="is";
		
		int index=0;
		
		int max=arr[0].length();
		
		for(int i =0;i<=arr.length-1;i++)
		{
			if(arr[i].contains(str2))
			{
				int elementLength = arr[0].length();
				for(int j=1; i< arr.length-1; j++) {
				    if(arr[j].length() > elementLength) {
				        index = i; elementLength = arr[j].length();
				    }
				}
				return arr[index];
				
			}
			
			
			
		
		}
		
		return null;
		
	}

}
