package ImmutableStringConcept;

import java.util.Arrays;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s = "Selenium";
		
		System.out.println(s+"automation");
		
		System.out.println(s);
		
		s = "cypress";
		
		System.out.println(s);
		
		String t1 = "Selenium";
		
		System.out.println(t1);
		
		
		String p = "Naveen";
		p = p + "Automation Labs";
		System.out.println(p);
		
		String t2 = "Naveen";
		System.out.println(t2);
		
		String r = "      hello selenium      ";
		r = r.trim();
		System.out.println(r);
		
		int i = 10;
		i = 10 + 50;//60
		
		String s11 = "java_py_ruby";
		String arr[] = s11.split("_");
		String t11 = arr[0] + "testing";
		
		System.out.println("---------------------------");
		
		String s12="Sarang_Anand_Napier_town";
		String arr1[]=s12.split("_");
		System.out.println(Arrays.toString(arr1));//to string method prints the whole array
		
		
	
		System.out.println(s11);
		System.out.println(Arrays.toString(arr));
		System.out.println(t11);
		
		
		String test = "       testing java     selenium    ";
		//System.out.println(test.replaceAll(" ", "m"));
		System.out.println(test.replace(" ", "m"));
		
		
		//loop -- main()
		
		
		String rest = "i am sarang and this is my code and i am so happy";
		System.out.println(rest.indexOf('i'));//0
		
		System.out.println(rest.indexOf('i', rest.indexOf('i')+1));//6
		
		System.out.println(rest.indexOf('i', rest.indexOf('i', rest.indexOf('i')+1)+1));//8
		
		System.out.println(rest.indexOf("i", rest.indexOf('i', rest.indexOf('i', rest.indexOf('i')+1)+1)+1));

		//while loop: give me the occurrence of all i
		

		
		
				String facStr="i am a believer in god and ighfiijyetiii";
				
				int j = 0;
				
					
				
				while(j < facStr.length())
				{
					if(facStr.charAt(j) ==  'i')
					{
						System.out.println("i  Found at Position "+j);
					}
					j++;
				}
			}
	
			
			
		
		
		
		
		
	}



	

