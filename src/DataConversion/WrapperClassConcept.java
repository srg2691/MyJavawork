package DataConversion;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);//10020
		
		//conversion string to int
		
		int i=Integer.parseInt(x);//Integer is a class and parse Int is a static method of the Integer class
		System.out.println(i+20);//120
		
		
		String y="100USD";
		System.out.println(y+20);//100USD20
		
		//int m=Integer.parseInt(y);//Number format exception since y value is not pure int and has USD in it
		
		//System.out.println(j+20);//
		
		//To handle above USD case - see below
		
		String curr[] =y.split("USD");
		
		System.out.println(curr[0]);
		
		int j=Integer.parseInt(curr[0]);
		System.out.println(i+20);
		
		//parseInt only understands numeric string and not alphnumeric strings
		//-----------------------------------------------------------------------------
		//String to double conversion
		//these conversions are used when reading anything from the browser in string format
		//and then converting it into primitive datatype for further use
		
		String s="12.33";
		System.out.println(s+20);
		
		double d=Double.parseDouble(s);//Double is a class a
		System.out.println(d+2);//gives numerical double value
		
		//---------------------------------------------------------------------------
		//String to boolean
		
		String headless="true";
		System.out.println(headless+20);
		
		Boolean converted=Boolean.parseBoolean(headless);//value of this statement is a boolean
		
		System.out.println(converted);
		//-------------------------------------------------------------------------------
		
		//Checking if the reverse is possible  - integer to string, double to string , boolean to string
		
		int k=100;
		//we want to convert k to String now
		
	
		String k1=String.valueOf(k);//Valueof is an overloaded method of String class 
		System.out.println(k1);//"100"
		
		System.out.println(k1+20);
		
		//this type of conversion is used to enter a value in the field of browser
		//this value has to be in String format
		
		//boolean to string coversion example
		
		boolean flag=true;
		String b1=String.valueOf(flag);
		System.out.println(b1);
		
		
		//max and min value using wrapper classes respectively
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
	
		
		
		 
		
		

	}

}
