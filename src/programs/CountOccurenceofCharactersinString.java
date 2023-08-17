package programs;

public class CountOccurenceofCharactersinString {

	public static void main(String[] args) {
		
		String str="I love Coding to do it better";
		
		//1. char array method and use for loop
		//2. str.length -- char at function
		//3. Apache Common string utils
		//4. stream 
		
		charcounting(str, 'i');
		getcharcount(str, 'o');
	}
		
		public static void charcounting(String str, char val)
		{
		int charcount=0;
		for(char ch: str.toCharArray())
		{
			if(ch==val)
			{
				charcount++;
			}
						
		}
		System.out.println(charcount);
		
	}
		//char at method
		
		public static void getcharcount(String str,char value)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==value)
				{
					count++;
				}
					
			}
			
			System.out.println(count);
		}

}
