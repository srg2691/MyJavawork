package programs;

import java.util.StringJoiner;

public class CombineStrings {

	public static void main(String[] args) {

		
		//Stringjoiner, introduced jdk 1.8
		
		StringJoiner joiner=new StringJoiner(",","[","]");
		joiner.add("Tom").add("Sarang").add("Naveen");
		
		System.out.println(joiner.toString());
	}

}
