package programs;

public class RemovejunkfromString {

	public static void main(String[] args) {

		
		String s="*&^*&sarang *&%anand";
		
		//use regex [^a-zA-Z0-9] to remove speical characters
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		
	}

}
