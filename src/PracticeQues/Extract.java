package PracticeQues;

public class Extract {

	public static void main(String[] args) {

		String stString = "India needs 43 runs to win in 23 balls";
	
		String newstr[]=stString.split(" ");
		
	   int m1=Integer.parseInt(newstr[2]);
	   int m2=Integer.parseInt(newstr[7]);
	   
//	   System.out.println(m1);
//	   System.out.println(m2);
	   
	   int sum=m1+m2;
	   System.out.println(sum);
	   
		

}
	
}
