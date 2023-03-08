package javaPrac;

public class Math {
	
	
	public int getMarks() {

 int a=10;
 int b=20;
int c=30;
int total=a+b+c;
System.out.println("total marks"+total);
return total;
	}

	

	//getMarks()- Function name/ method name

	//void- Return type i.e cannot return any value

	public static void main(String[] args) {

Math m1= new Math();
int t=m1.getMarks();
System.out.println(t+20);
}

	

}
