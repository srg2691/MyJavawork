package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterfaceconcept {

	public static void main(String[] args) {

		
		List<String> namesList=  new ArrayList<String>();//upcasting with List Interface 
		//List is parent interface of ArrayList class
		
		namesList.add("Sarang");
		namesList.add("Anand");
		namesList.add("Tom");
		namesList.add("Sajal");
		namesList.add("Jabalpur");
		System.out.println(namesList);
		
		System.out.println(namesList.size());
		
		for(String e: namesList)
		{
			System.out.println(e);
			if(e.equals("Tom"))
			{
				System.out.println("he is a manager");
				break;
			}
			
		}
		
		//Arrays class---asList method
		
		List<String> browserList=Arrays.asList("Chrome","Firefox","IE","Safari","Edge");
		//asList method allows storing values in the array list 
		//as List method returns a list of type string hence we are storing it in a List<String>
		System.out.println(browserList.size());
		System.out.println(browserList);
		
		List<Integer> marks=Arrays.asList(12,45,67,89,90);
		//same implementation with Integer type
		
		//conversion of static array to a dynamic array
		
		String country[]= {"India","Pakistan","France","USA","UK"};
		
		List<String> countryList=Arrays.asList(country);
		//above statement converts the static array to dynamic array using asList method
		//asList method returns a List of String and hence we store in List<String>
		
	//country--static array||| countryList--Dynamic array
		
		
		countryList.add("Africa");//unsupported operation exception
		countryList.add("Thailand");
		
		countryList.remove(2);//unsupported operation exception
		//above exception because asList method is immutable , and hence if we try to add new data in the list
		//we get unsupported exception as the arraylist was created using asLIst method
		//once arraylist is created using as List method, the list cannot be changed
		
		System.out.println(countryList);
		
		
		
		
		
		
	}

}
