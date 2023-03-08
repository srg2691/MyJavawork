package OOPS_Constructor;

public class Overloadtest {

public static void main(String[] args) {
		
		Overloading o=new Overloading();
		int first=o.sum(5, 10);
		double second=o.sum(2.5, 7.9,123.2);
		double third=Overloading.sum(3,2,5.8);
		
		System.out.println("first sum is "+first);
		System.out.println("second sum is "+second);
		System.out.println("third sum is "+third);
		

	}

}
