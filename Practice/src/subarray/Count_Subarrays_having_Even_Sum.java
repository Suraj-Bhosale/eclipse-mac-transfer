package subarray;

import java.util.HashMap;

public class Count_Subarrays_having_Even_Sum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 1};
        int n = arr.length;
        
        int sum = 0, odd = 0, even = 0, value = 0, count = 0;
        
        for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
	           if(sum % 2 == 0){
	        	   count += even + 1;
	               even++;
	           }
	           else{
	        	   count += odd;
	               odd++;
	           }
        }
        
        System.out.println(count);
	}


}
