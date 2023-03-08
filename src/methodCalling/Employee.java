package methodCalling;

public class Employee {
	
	String name;
	int age;
	
	public int add(int a,int b) //parameters
	{
		System.out.println(" Sum of two numbers");
		int sum=a+b;
		return sum;
	}
	
	
	public void getInfo(Employee emp) //parameter for this method is a reference 'emp' of type Employee
	{
		emp.name="Sarang";
		emp.age=31;//latest values would be sarang and 31 since the method getInfo is updating the values 
		//after they were assinged in main method
		
		System.out.println(" name and age are "+name+" "+age);
	}

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		//e1.add(10, 15); //10 and 15 are arguments  //method CALL BY VALUE 
		
		//System.out.println(e1.name+" "+e1.age);// this statement will give default values of name and age since values are not assigned yet
		
		e1.name="Anand";
		e1.age=25;//updating values using the object e1 
		
		e1.getInfo(e1); // getInfo method is being called with e1 as the reference //CALL BY REFERENCE
		// e1 is assinged to emp in the above method call
		
		
		System.out.println(e1.name+" "+e1.age);//after this method call, the values for name and age would be taken from getInfo method
		
		

	}

}
