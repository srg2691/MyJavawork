package programs;

public class MissingNumberinArray {

	public static void main(String[] args) {
		
		
//		int a[]= {1,2,3,4,5};
//		1+2+3+4+5=15
//				1+2+3+5=11
//				15-11=4
		
		int arr[]= {1,2,4,5};
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
		int sum1=0;
		
		for(int j=1;j<=5;j++)
		{
			sum1=sum1+j;
		}
		
		System.out.println(sum1);

		
		int missingnum=sum1-sum;
		
		System.out.println(" missing number is  "+missingnum);
	}

}
