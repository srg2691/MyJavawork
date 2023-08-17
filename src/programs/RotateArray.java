package programs;

import java.util.Arrays;

public class RotateArray {
	
	public static void rotate( int[] nums, int order)
	{
		for(int i=0;i<order;i++)
		{
			for(int j=nums.length-1;j>0;j--)
			{
				int temp=nums[j];
				nums[j]=nums[j-1];
				nums[j-1]=temp;
			}
		}
		
//		for(int e:nums)
//		{
//			System.out.print(e);
//		}
		
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7};
		
		System.out.print(Arrays.toString(nums));
		
		rotate(nums,3);

	}

}
