package programs;

public class highestandLowestinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max=0;
		
		
		int arr[]= {100,67,89,2,88,45,87,222,65354};
		
		
		int len=arr.length;
		
		for(int i=0;i<=len-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		int min=arr[0];
		
		for(int j=0;j<=len-1;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
			}
		}
		
		
		System.out.println(" maximum number is  "+max);
		System.out.println(" minimum number is  "+min);
		
	}

}
