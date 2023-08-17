package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {
	
	

	public static void main(String[] args) {

		int i[]= {1,2,3,5};//static arrays of fixed size
		int l[]=new int[4];//static arrays of fixed size
		//static array to be used when we know the size is fixed like months in a year
		
		//dynamic array
		//ArrayList  -deafult class available in java

		//Arraylist is order based collection - order/index is maintained 
		//values will be stored starting from 0th position in the array list
		
		ArrayList ar=new ArrayList();//default array list declaration
		//by default it will create 10 segments in the heap memory
		
		//size is by default 0 from above statement
		
		System.out.println(ar.size());//size() method is used to get the size of arraylist//size is 0 right now
		ar.add(100);
		ar.add(200);//adding elements to array
		System.out.println(ar.size());//size is 2 now
		
		ar.add("testing");
		ar.add(23.44);
		ar.add(true);
		ar.add('g');
		//a generic array list can contain all type of data
		
		System.out.println(ar.size());
		
		//removing values
		ar.remove(2);
		//duplicates and nulls are allowed in arraylist
		
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		//print all values of arraylist
		System.out.println(ar);
		//printing using for loop
		
		for(int k=0;k<ar.size();k++)
		{
			System.out.println(ar.get(k));
		}
		
		//foreach loop
		
		for(Object j:ar)
		{
			System.out.println(j);
		}
		
		
		
		
		
		
		
		}
	}


