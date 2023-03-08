package OOPS_Constructor;

public class Company {
	
	private String name;
	private int empCount;
	private int shareprice;
	
	
	
	
	public Company(String name, int empCount, int shareprice) {
		
		this.name = name;
		this.empCount = empCount;
		this.shareprice = shareprice;
	}

	public String getName() {
		return name;
	}
	
	//setter methods can be replaced by parameterized constructor
	
	//imp use case for setter is that if user wants to keep updating values of the private members
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int getEmpCount() {
		return empCount;
	}
//	
//	public void setEmpCount(int empCount) {
//		this.empCount = empCount;
//	}
	
	public int getShareprice() {
		return shareprice;
	}
	
//	public void setShareprice(int shareprice) {
//		this.shareprice = shareprice;
//	}
	
	

}
