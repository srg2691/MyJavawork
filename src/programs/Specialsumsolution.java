package programs;

import java.util.ArrayList;

public class Specialsumsolution {
	
	
	public static void main(String[] args) {
		int sum=specialSum();
		System.out.println(sum);
	}
    public static int specialSum() {

        // Declare a variable 'sum' and initialize it with zero.
        int sum = 0;
        
        
        int arr[] = {18,45,67,11,23};
        
        int n=arr.length;
        
        for (int i = 0; i < n; i++) {

            // Add each element to the variable 'sum'.
            sum += arr[i];

            if (sum > 9) {

                /*
                    Store the sum of the digits of the variable
                    'sum' in a new variable 'tempSum'.
                */
                int tempSum = 0;
                tempSum= tempSum+ (sum % 10);
                sum =sum/ 10;
                tempSum += sum;

                // Update 'sum' as 'tempSum'.
                sum = tempSum;
            }
        }

        return sum;

    }
}
