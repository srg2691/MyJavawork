package DynamicArray;

import java.util.ArrayList;

public class ArrayListSpecific {

	public static void main(String[] args) {
		
		ArrayList<Integer> numlist=new ArrayList<Integer>();
		
		ArrayList<String> names=new ArrayList<String>();
		
		ArrayList<Object> Objects=new ArrayList<Object>();
		
		//numlist.add("Sarang");//error because arraylist can have only integer data
		numlist.add(200);
		numlist.add(300);
		numlist.add(400);
		
		//removing data by value 
		numlist.remove(200);
		
		System.out.println(numlist);
		
		//foreach loop
		
		for(Integer e:numlist)
		{
			System.out.println(e);
		}
		
		//index based for loop
		
		for(int i=0;i<numlist.size();i++)
		{
			System.out.println(numlist.get(i));
		}
		
		
		
		

	}

}
