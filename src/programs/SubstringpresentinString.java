package programs;

public class SubstringpresentinString {

	public static void main(String[] args) {
		
		System.out.println(isSubstring("naveen autoamtion labs", "labs"));
		
	}
	
	
		
		public static boolean isSubstring(String main, String sub)
		{
			return main.matches("(.*)"+sub+"(.*)");
		}

	

}
