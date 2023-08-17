package ImmutableStringConcept;

public class StringPractice {

	
	String name;
	String city;
	
	public StringPractice(String name,String city)
	{
		this.name=name;
		this.city=city;
	}
	public static String concat(String name,String city)
	{
		String con=name+city;
		System.out.println(con);
		return con;
	}
	
	
	public static void main(String[] args) {
		

		
		
		
		StringPractice sp=new StringPractice("Sarang","Pune");
		System.out.println(sp.name);
		System.out.println(sp.city);
		
	
		concat("Sarang","Jabalpur");
		

	}

}
