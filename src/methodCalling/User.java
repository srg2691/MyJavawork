package methodCalling;

public class User {
	
	static String name;
	int age;
	String city;
	
	

	public User(String name, int age, String city) //first constructor
	{
		
		this.name = name;
		this.age = age;
		this.city = city;
		
		//usecases of this keyword
		//1. constructor - assigning class variables to local variables(method variables)
		//2. methods - encapsulation
		//3 builder pattern
		//4. constructor calling another constructor
		//5. used in method calling
	}

	public User(String name, int age) //second constructor
	{
		this("Sajal", 67, "Pune");//calling first constructor from the second constructor using this keyword
		//with parameters
		
		this.name = name;
		this.age = age;
	}
	
	public void login()
	{
		this .logout();// method calling using this keyword
		//also can be written as below
		//logout();
	}
	
	public void logout()
	{
		
	}




	public static void main(String[] args) {
		
		User u1=new User("Sarang",30);//calling second constructor
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.city);
		
		

	}

}
