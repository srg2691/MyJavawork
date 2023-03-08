package PracticeQues;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraytwo {

	
	public void check(int a)
	{
		
		int numarr[]= {1,3,5,8,5,44,67};
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(15);
		arr.add(11);
		
		arr.add(17);
		arr.remove(11);
		System.out.println("----------------");
		System.out.println(arr);
	
		
		
		
		for(int i=0;i<=numarr.length-1;i++)
		{
			if(numarr[i]==a)
	{
			System.out.println(a+" is found in the array");
				break;
		}
			
					
		}
		
	}
	public static void main(String[] args) {
           Arraytwo ar=new Arraytwo();
           ar.check(5);
	}

}
