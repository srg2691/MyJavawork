package programs;

import java.util.function.IntPredicate;

public class VowelCountinString {

	public static void main(String[] args) {
		
		String str="aeiouAEIOU";
		int count=0;
		
		for(int x=0;x<str.length();x++)
		{
			if(isVowel(str.charAt(x)))
			{
				count++;
			}
		}
		System.out.println(count);
		
		//java 8 streams
		
		IntPredicate vowel=new IntPredicate() {
			
			@Override
			public boolean test(int t) {
				// TODO Auto-generated method stub
				 return t=='a' ||t=='e' ||t=='i' ||t=='o' ||t=='u'||
						t=='A' ||t=='E' ||t=='I' ||t=='O' ||t=='U';
			}
		};
		
		String test=" Naveen Autoamation Labs";
		long count1=test.chars().filter(vowel).count();
		System.out.println(count1);
		
	}
		
		//java method
		
		public static boolean isVowel(char t) 
		{
			return t=='a' ||t=='e' ||t=='i' ||t=='o' ||t=='u'||
					t=='A' ||t=='E' ||t=='I' ||t=='O' ||t=='U';
		}
			
		
		//java 8 streams
		
		
	

}
