package MultiInhertiance;

public interface EducationBoard {
	
	// interface cannot have final methods
	
	int fee=500;
	
	public void syllabus();
	
	public void curriculum();
	
	//after jdk 1.8- 
	//1. static methods can have method body in interface
	
	public static void Method()
	{
		
	}
	

	
	//2. 
	//default methods - are NOT STATIC but can have method body unlike other interface methods
	//this is due to the 'default' access modifier
	
	default void getMedrecords()//method body is required
	{
		
	}
	
}
