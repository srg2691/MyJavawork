package StringBuild;

public class Countoccurence {
	
	public static void Count(String s)
	{
		//String s1="aabbccddd";
		
		int len=s.length();
		int counter[] = new int[256];
		
		 // Count frequency of every character and store
        // it in counter array
        for (int i = 0; i < len; i++) {
            counter[(int) s.charAt(i)]++;
        }
        // Print Frequency of characters
        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
		
		
	
		
		}
	
		
	

	public static void main(String[] args) {
		
		Count("SarangAnand");

	}

}
