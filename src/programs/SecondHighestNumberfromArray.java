package programs;

public class SecondHighestNumberfromArray {

	public static void main(String[] args) {
		
		int secondhighest=Secondhigh();
		
		System.out.println(secondhighest);
	}

	
	
	public static int Secondhigh()
	{
		int arr[]= {12,67,33,66,89,123,56};
		int len=arr.length-1;
		int max=arr[0];
		int maxindex=0;
		
		
		for(int i=0;i<=len;i++)
		{
			if(arr[i]>max)
			{
			  max=arr[i];
			  maxindex=i;
			}
		}
			
			int secondmax=Integer.MIN_VALUE;
			
			for(int i=0;i<=len;i++)
			{
				if(i!= maxindex && secondmax<arr[i])
				{
					secondmax=arr[i];
				}
				
				
			}
			
	
		return secondmax;

}
}
