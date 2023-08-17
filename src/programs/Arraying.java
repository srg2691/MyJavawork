package programs;

import java.util.Arrays;
import java.util.Collections;

public class Arraying {
	
	public void Sorting()
	{
		
		int numarr[]= {1,3,5,8,5,44,67};
		String strarr[]= {"Java","Sarang","Selenium"};
		System.out.println(strarr.length);
		System.out.println(numarr.length);
		
		Arrays.sort(numarr);
		Arrays.sort(strarr);
		
		System.out.println(Arrays.toString(numarr));
		System.out.println(Arrays.toString(strarr));
	}
	
	public void sum()
	{
		int numarr[]= {1,1,45};
		int sum=0;
		
		for(int i=0;i<=numarr.length-1;i++)
		{
			sum=numarr[i]+sum;
		}
		
		System.out.println(sum);
	}

	public void avg()
	{
		//int numarr[]= {1,3,5,8,5,44,67};
		int numarr[]= {1,2,3};
		int avg=0;
		int sum=0;
		
		for(int i=0;i<=numarr.length-1;i++)
		{
			sum=numarr[i]+sum;
		}
		
		avg=sum/numarr.length;
		System.out.println(avg);
		
	}
	public static void main(String[] args) {
		
		
		Arraying a=new Arraying();
		a.Sorting();
		a.sum();
		a.avg();
		
		

	}

}
