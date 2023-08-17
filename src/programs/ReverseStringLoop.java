package programs;

import java.util.Arrays;

public class ReverseStringLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str=" Welcome to Mastercard World";
		System.out.println(str);
		String expression[]=str.split(" ");
		System.out.println(Arrays.toString(expression));
		
		int len=expression.length;
		String backwards="";
		
		for(int i=len-1;i>=0;i--)
		{
			backwards=backwards+" "+expression[i];
		}
		
		System.out.println(backwards);

	}

}
