package programs;

import java.util.Arrays;
import java.util.List;

public class Practice {
	
	public void reverse()
	{
		String str1=" This is a string ";
		
		char ch[]=str1.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
			//String rev=rev+str1.charAt(i);
		}
		
		
		
	}
	
	public void CountChar()
	{
		String str=" This String   has  characters   and spaces 123455";
		int len=str.length();
		char arr[]=str.toCharArray();
		
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		
		for(int i=0;i<=len-1;i++)
		{
			if(Character.isLetter(arr[i]))
			{
				letter++;
			}
			
			else if(Character.isDigit(arr[i]))
			{
				num++;
			}
			
			else if(Character.isSpaceChar(arr[i]))
			{
				space++;
			}
			
			else {
				other++;
			}
			
		}
		System.out.println(str);
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
		
	}
	
	
	

	public static void main(String[] args) {
		
		Practice p=new Practice();
		p.reverse();
		p.CountChar();
		
	

		
//		System.out.println("\nJava Version: "+System.getProperty("java.version"));
//	    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
//	    System.out.println("Java Home: "+System.getProperty("java.home"));
//	    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
//	    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
//	    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	}

}
