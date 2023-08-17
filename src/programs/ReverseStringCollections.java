package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str=" Sarang is a tester";
		
		List<String> arr=new ArrayList<String>();
		
		arr.add("Sarang");
		arr.add("is");
		arr.add("a");
		arr.add("tester");
		
		System.out.println(arr);
		
		
		 Collections.reverse(arr);
		 System.out.println(arr);
	}

}
