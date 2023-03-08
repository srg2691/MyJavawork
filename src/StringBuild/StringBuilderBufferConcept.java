package StringBuild;

public class StringBuilderBufferConcept {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Selenium");
		sb.append("testing");
		
		System.out.println(sb);
		
		String s1="Cypress";
		s1.concat("ui testing");
		System.out.println(s1);
		

	}

}
