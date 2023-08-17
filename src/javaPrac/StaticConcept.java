package javaPrac;

public class StaticConcept {
	
	static int i=5;
	
	public void stats(int i) {
		System.out.println(i);
	}
	
	public char stats(char k) {
		System.out.println(k);
		return k;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=7;
		StaticConcept.i=6;
		System.out.println(StaticConcept.i);
		System.out.println(i);

	}

}
