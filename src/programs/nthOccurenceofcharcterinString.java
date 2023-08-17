package programs;

public class nthOccurenceofcharcterinString {
	
	public static void main(String[] args) {
		


String str=" The rains have started here for ages apart";



System.out.println(str.indexOf('s'));//1st occurence

System.out.println(str.indexOf('s', str.indexOf('s')+1));//2nd occurence

System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1));//3rd occurence

System.out.println(str.indexOf("hello"));//-1

String st="your order ID is 12434 for future use";


String order=st.substring(st.indexOf("is")+3,21);

System.out.println(order);




	}

}