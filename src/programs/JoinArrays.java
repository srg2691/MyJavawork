package programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinArrays {

	public static void main(String[] args) {

		
		String[] batsmen= {"a","b","c"};
		
		String[] bowlers= {"d","e","f"};
		
		Stream<String> sbat=Arrays.stream(batsmen);
		Stream<String> sbow=Arrays.stream(bowlers);
		
		String fullTeam[] =Stream.concat(sbat, sbow).toArray(size -> new String[size]);
		
		
		for(String s:fullTeam)
		{
			System.out.println(s);
		}
		}
	
	
	//Google Guava - download its jar
	
//	String team[]=ObjectArrays.concat(batsmen,bowlers,String.class);
//	
//
//	for(String s:team)
//	{
//		System.out.println(s);
//	}
	
	
	
	

}
