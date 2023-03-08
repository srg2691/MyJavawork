package javaPrac;

public class returnArray {

int []arr= new int[4];

public int[] fillArray() 
{

	for(int i=0; i<4; i++) 
	{
		
		arr[i]= i+2;
	}
	return arr;
}

public void printArray(int []b) {

	for(int i=0;i< 4; i++) {
		System.out.println(b[i]);
		
	}
}


public static void main(String[] args) {

	returnArray a= new returnArray();
	int b[] = a.fillArray();
	a.printArray(b);
		}


}
