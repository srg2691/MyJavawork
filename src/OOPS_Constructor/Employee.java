package OOPS_Constructor;

public class Employee {
	
   String Company;
   String Empname;
   int salary;
   
  

	public Employee(String company, String empname, int salary) {
	
	this.Company = company;
	this.Empname = empname;
	this.salary = salary;
	print();
}
	
	public void print() {
		System.out.println(" Name of company is "+Company);
		System.out.println(" Name of Employee is "+Empname);
		System.out.println("Salary of employee is "+salary);
	}
	
	public Employee(String company) {
		
		Company = company;
	}



	public static void main(String[] args) {
		
		Employee e=new Employee("Media","Sarang",450);
		
		System.out.println(e.Company+" "+e.Empname+" "+e.salary);
		Employee e1=new Employee("Acc");
		System.out.println(e1.Company);
		e1=e;
		
		System.out.println(e1.Company);

		System.out.println(e.Company);
		
		
		

	}

	

}
