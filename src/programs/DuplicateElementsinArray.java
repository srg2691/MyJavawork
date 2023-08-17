package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsinArray {

	public static void main(String[] args) {

		
		int count=0;
		
		int arr[]= {1,2,3,4,5,3,2,4,8,9,6,4,5};
		
		for(int i=0;i<=arr.length-1;i++)   //O(n2) //worst approach/least efficient approach
		{
			for(int j=i+1;j<arr.length;j++)
			
				if(arr[i]==arr[j])
				{
					System.out.println(" Duplicate Element is "+arr[i]);
					
				}
				
				}
		
		System.out.println("*********************************");
		
		//using hashset: stores unique values only O(n)
		
		
		String names[]= {"Java","javascript","Ruby","java","c","c","Java"};
		
		Set<String> storename=new HashSet<String>();
		
		for(String name:names)
		{
			if(storename.add(name)== false)
			{
				System.out.println(" Duplicate Element is "+name);
			}
		}
		
		System.out.println("***********************************");
		
		//using HashMap O(2n)
		
		Map<String,Integer> storeMap=new HashMap<String,Integer>();
		
		//putting the values in the hashmap
		for(String name1:names)
		{
			Integer counter=storeMap.get(name1);
			if(counter==null)
			{
				storeMap.put(name1, 1);
			}
			
			else {
				storeMap.put(name1, ++counter);
				
			}
		}
		
		//get the values from the Map
		
		Set<Entry<String,Integer>> entrySet=storeMap.entrySet();
		
		for(Entry<String,Integer> entry:entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(" Duplicate element is  "+entry.getKey());
			}
		}

}
}
