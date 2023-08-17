package javaPrac;

public class Shortcircuit {

	public static void main(String[] args) {


		int x =75 ; 
		int y =400; 
		int z=300;

		//short circuit AND
		if((x>y) && (y>z))

				{

			System.out.println("x is the greatest");

				}

		else{

			System.out.println("x is not the greatest");
			
			//short circuit OR
			if((x>y) || (y>z))
			{

				System.out.println("x is greater");

				}


			

		}
	}

}
