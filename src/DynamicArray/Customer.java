package DynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
		
		List<String> namesList=  new ArrayList<String>();
		
		namesList.add("Sarang");
		namesList.add("Anand");
		namesList.add("Tom");
		namesList.add("Sajal");
		namesList.add("Jabalpur");
		
		for(int i=namesList.size()-1;i>=0;i--)//printing data of list in reverse order
		{
			System.out.println(namesList.get(i));
		}
		
		Collections.reverse(namesList);//Collections is a class
		//reverse method prints the list in reverse order
		System.out.println(namesList);
		
		Collections.sort(namesList);//automatically will sort on alphabetical order
		System.out.println(namesList);
		
		Collections.swap(namesList, 0, 3);//swaps data among two indexes provided
		System.out.println(namesList);
		
		namesList.add("Pune");
		namesList.add(5, "Baner");//adding element at specific index, the existing element
		//would be shifted to the next index
		
		//namesList.add(8, "Balewadi");//IOB exception since list size is 5 currently  
		//System.out.println(namesList.get(8));//IOB
		System.out.println(namesList);
		
		System.out.println(namesList.get(5));
		
		

	}

}
