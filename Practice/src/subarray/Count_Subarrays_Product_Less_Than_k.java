package subarray;

public class Count_Subarrays_Product_Less_Than_k {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		int n = arr.length, k = 10;
		long prod = 1;
				
		int count = 0;
		
	    int i = 0, j = 0, sum = 0;
	    int maxLen = Integer.MIN_VALUE;
	   

	    while (j < n) {
	    	prod *= arr[j];
	            while (prod >= k && i <= j) {
	            	prod /= arr[i];
	                 i++;
	            }
	            
	             count += j - i + 1;
	            j++;
	       
	    }
	    System.out.println(count);

	}

}
