package javaPrac;

public class Overloading {
	
	public int Rest(String name) {
		
		System.out.println(" name of restaurant is xyz");
		return 100;
		
	}
	
	public void Rest(String name1,String dish)
	{
		
		String ch[] = new String[3];
		ch[0]="Dish 1";
		ch[1]="Dish 2";
		ch[2]="xyz restaurant";
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println("["+i+"]"+ch[i]);
		}
		
		for(String pr:ch) {
			System.out.println(pr);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Overloading o=new Overloading();
		o.Rest("idli","dosa");
	}

}
