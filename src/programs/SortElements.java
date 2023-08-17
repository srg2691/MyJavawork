package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeSet;

public class SortElements {

	public static void main(String[] args) {

		
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,3,5,3,4,5,7,8,534,67,45,34));
		
		//1. Tree Set - for sorting elements automatically
		
		TreeSet<Integer> newlist=new TreeSet<Integer>(list);
		
		ArrayList<Integer> sortedList = new ArrayList<Integer>(newlist);
		
		System.out.println(newlist);
		
		
		
		
	}

}
