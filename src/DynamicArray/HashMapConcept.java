package DynamicArray;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//Hashmap is a dynamic storage mechanism
		//all collections are dynamic storage
		
		//declaration
		//stores data in <key,value> pair
		//marks=100
		//country=India
		
		HashMap<String,String> Employeemap=new HashMap<String,String>();//hashmap is a class in Java
		//<String, String> is the format of key and value
		
		Employeemap.put("Sarang", "Test Specialist");//put method used to add values to key and corresponding value
		Employeemap.put("Sajal", "SDET1");
		Employeemap.put("Ravi", "Manager");
		Employeemap.put("Sarang", "CEO");
		Employeemap.put(null, "CTO");
		Employeemap.put(null, null);
		
		
		//Order is not maintained in HashMap
		
		System.out.println(Employeemap.get("Sarang"));//used to get the value
		//by giving the key 
		//if key is duplicate, the latest value that the key holds will be returned as output
		
		System.out.println(Employeemap.get("Tom"));//if key not present, output is null
		System.out.println(Employeemap.get(null));
		//NPE will not be thrown as we are just fetching the value at null key
		
		System.out.println(Employeemap.get(null));
		//if both key and value are null, the result is null
		
		System.out.println(Employeemap);//to print the entire HashMap
		//order is random
		
		HashMap<String,Integer> browserMap=new HashMap<String,Integer>();
		
		browserMap.put("chrom", 100);
		browserMap.put("firefox", 90);
		browserMap.put("ie", 7);
		browserMap.put("safari", 10);
		
		System.out.println(browserMap);
		
		//by default 15 segments are created when hashmap is declared 
		
		//revise collision in HashMap - same hashcode can cause collision amongst two or more k,v pairs
		//after jdk 1.8 - threshold =8
		//if threshold is broken , the list is converted to Binary tree
		
		

	}

}
