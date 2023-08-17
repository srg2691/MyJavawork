package programs;

import java.util.Arrays;

public class ArraySortAscending {

	public static void main(String[] args) {
		
//	sortArrayUsingSort();
//	sortArraywithloop();
		
		multiply();

	}
	
	
	public static void sortArrayUsingSort()
	{
		int arr[]= {1,5,8,7,-1,87,-5,9};
		
		Arrays.sort(arr);
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	
	public static int[] sortArraywithloop()
	{
		
		System.out.println("---------------------------");
		
	int arr[]= {3,6,8,88,-3,-5,89,99};
	
	int temp=0;
	
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[i]<arr[j])   //for descending condition
				//for ascending condition - if(arr[i]>arr[j]) //rest reamins same
			{
				temp=arr[i];    
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	
		System.out.println(arr[i]);
		
		
	}
	return arr;
	}
	
	public static void multiply()
	{
		int descendingarr[]=sortArraywithloop();
		
		int first=descendingarr[0];
		int second=descendingarr[1];
		
		long mul=first*second;
		
		System.out.println(" multiplication os two highest numbers of array is "+mul);
		
		
		
		
	}

}
