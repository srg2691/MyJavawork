package programs;

public class Fibonacci {

	public static void main(String[] args) {

		
		int n =10;
		int firstterm=0;
		int secondterm=1;
		
		for(int i=0;i<=n;++i)
		{
			System.out.println(firstterm+"");
			//calculation of next term
			
			int nextterm=firstterm+secondterm;   //c=a+b
			firstterm=secondterm;                 //a=b 
			secondterm=nextterm;                  //b=c
		}
	}

}
