package PracticeQues;

import java.util.Arrays;

public class SortArray0and1 {

	public static void main(String[] args) {

		
		int [] arr= {1,0,1,1,0,0,0,1,0,0,1};
		
		
	
		System.out.println("start program");
		
		int len=arr.length;
		int temp=0;
		
		for(int i=0;i<=len-1;i++)
		{  
			for(int j=i+1;j<len;j++)
			if (arr[i]>arr[j])
			{
				temp=arr[i];    
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			
		}
		
		
		System.out.println(Arrays.toString(arr));
	}
		
	
	
}

