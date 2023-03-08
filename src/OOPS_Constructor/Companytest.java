package OOPS_Constructor;

public class Companytest {

	public static void main(String[] args) {
		
		Company c1=new Company("Mediaocean",5000,123);
		
//		c1.setName("Acc");
//		c1.setEmpCount(5000);
//		c1.setShareprice(123);
		
		System.out.println(c1.getName());
		System.out.println(c1.getEmpCount());
		System.out.println(c1.getShareprice());
		
		//Registration class
		
		Registration rg=new Registration("Tom",35,"Pune","01-01-1990");
		
		System.out.println(rg.getName());
		System.out.println(rg.getAddress());
		System.out.println(rg.getAge());
		System.out.println(rg.getDob());
		
		rg.setAddress("Baner,Pune");
		rg.setAge(40);
		
		System.out.println(rg.getAddress());
		System.out.println(rg.getAge());
		

	}

}
