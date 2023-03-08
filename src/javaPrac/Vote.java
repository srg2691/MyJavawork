package javaPrac;

public class Vote {
	
	public int voting(int age) {
		
		System.out.println(" the age of the person is "+age);
		if(age>=18)
		{
			System.out.println(" the person is eligible to vote");
			
		}
		
		else {
			System.out.println(" the person is not eligible to vote");
		}
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vote v=new Vote();
		int v1=v.voting(18);
		
	}

}
