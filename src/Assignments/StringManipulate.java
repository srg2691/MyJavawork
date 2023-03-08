package Assignments;

import java.util.Arrays;

public class StringManipulate {
	
	String s1;
	String s2;
	
	//String compare using .equals
	public static int StringCompare(String s1, String s2)
	{
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println(" Strings are equal");
		}
		
		else {
			System.out.println(" Strings are not equal");
		}
		return -1;
	}
	
	//to print first and last character of String
	public static void Firstlast(String s1)
	{
		int len=s1.length();
		for(int j=0;j<=len;)
		{
			System.out.println(s1.charAt(j));
			j=s1.length()-1;
			System.out.println(s1.charAt(j));
			break;
		}
	}
	
	//To check if a string has a specific word or character in it
	public static void Contain(String s1)
	{
		if(s1.contains("a"))
		{
			System.out.println(" String has the character a");
			
		}
		
		else
		{
			System.out.println(" String doesnt have the character");
		}
	}
	
	//Reversing a string
	
	public static String reversing(String name)
	{
		int len =name.length();
		String rev="";
		for(int k=len-1;k>=0;k--)
		{
			rev=rev+name.charAt(k);
		}
		
		return rev;
	}

	//to get the last half of the string
	public static void Lasthalf(String s)
	{
		//String last="";
		int len=s.length();
		String half[]=s.split("_");
		System.out.println(half[1]);
		

	}
	//to get the third 'e' in the string //ask Naveen
	public static void third()
	{
		String str="Welcome to Naveen Automation Labs ! ";
		
		System.out.println(str.indexOf('e'));//first occurence of 'e'
	System.out.println(str.indexOf('e', str.indexOf('e')+1));//second occurence of 'e'
	//System.out.println(str.indexOf('e')+1, str.indexOf('e'));
		
		
	}
	
	
	public static int returning(String s)
	{
		if(s.contains("Sarang"))
		{
			//System.out.println(" string is present");
			int index=s.indexOf("Sarang");
			System.out.println("Index of String is "+index);
			return index;
		}
		
		else
		{
			return -1;
		}
		
	}
	
	//break string into array and print it 
	public static void BreakString(String str)
	{
		String arr[]=str.split(" ");
		//System.out.println(Arrays.toString(arr));//to print all values of the array we use Arrays.To String method
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	//to break string in array and print the middle word
	public static void Middle(String st)
	{
		String md[]=st.split(" ");
		System.out.println(md[1]);
	}
	
	
	public  void getIntegerfromString()//get integer part from string 
	{
		String s = "your transaction id is: 12345 and reference id is 34567";
		String[] arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		
		
		for(int j=0;j<=arr.length-1;j++)
		{
			if(arr[j].equals("12345"))
			{
				String s1=arr[j];
				System.out.println(s1);
				System.out.println(s.indexOf("12345"));
			}
			
			else if(arr[j].equals("34567"))
			{
				String s2=arr[j];
				System.out.println(s2);
				System.out.println(s.indexOf("34567"));
				
			}
			
			else {
				System.out.println(" not found");
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		StringManipulate sm=new StringManipulate();
		StringCompare("Sarang","sarang");
		String s2="     Hello   Java    ";
		System.out.println(s2.trim());
		Firstlast("Sarang");
		Contain("Sarang Anand first program");
		String r1=reversing("Sarang");
		System.out.println(r1);
		Lasthalf("Sarang Anand_Mediaocean");
		third();
		returning(" hi Sarang Anand Pune ");
		BreakString(" hi Sarang Anand Pune ");
		Middle("Sarang Anand Baner");
		sm.getIntegerfromString();
		
		String s11="Selenium";
		String ar2[]=s11.split("");
		System.out.println(Arrays.toString(ar2));
		
		
	}
	
	
	

}
