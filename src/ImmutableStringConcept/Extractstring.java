package ImmutableStringConcept;

public class Extractstring {

	public static void main(String[] args) {

		
		String s5="This is your order id  namely  11234";

		System.out.println(s5.length()); //27

		System.out.println(s5.substring

		(s5.indexOf("namely")+8, s5.length())); 
	}

}
