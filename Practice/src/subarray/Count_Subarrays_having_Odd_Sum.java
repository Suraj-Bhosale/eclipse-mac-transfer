package subarray;

import java.util.HashMap;

public class Count_Subarrays_having_Odd_Sum {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,1,4};
        int n = arr.length;
        int sum = 0, odd = 0, even = 0, value = 0, count = 0;
        
        for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
	           
	           if(sum % 2 == 0){
	            count+= odd;
	            even++;
	           }
	           else{
	              count += 1 + even;
	              odd++;
	           }
        }
        
        System.out.println(count);
	}

}
