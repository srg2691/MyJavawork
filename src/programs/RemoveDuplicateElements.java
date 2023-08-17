package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,5,4,3,1,2,3,45,2,68,9,7));
		
		//1. Linked HashSet
		
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> uniqueList=new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(uniqueList);
		
		
		//------------------------------------------------------//
		
		ArrayList<String> stringlist=new ArrayList<String>(Arrays.asList("Sarang","Sarang","Anand","Sajal"));
		
		stringlist.add("Napier");
		System.out.println(stringlist);
		
		LinkedHashSet<String> nameslist=new LinkedHashSet<String>(stringlist);
		
		ArrayList<String> uniquelist=new ArrayList<String>(nameslist);
		
		System.out.println(nameslist);
		
		
		
		//After JDK 8
		//2. Stream
		
		ArrayList<Integer> markslist=new ArrayList<Integer>(Arrays.asList(2,3,5,3,3,2,4,5,3,3,5,3,4,3,5,4));
		
		List<Integer> uniquemarkslist=markslist.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniquemarkslist);
		
		
		
	}

}
