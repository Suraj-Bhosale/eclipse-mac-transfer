package subarray;

public class Count_Subarray_Sum_Greater_Than_X {


	public static void main(String[] args) {
		
		int[] A = {3,2,1};
		int n = A.length;
		int x  =  2;
		
		longSubarrWthSumDivByK(A,n,x);
	}
	
    static void longSubarrWthSumDivByK(int arr[], int n, int k)
    {
	    int i = 0, j = 0, sum = 0;
	    int minLen = Integer.MAX_VALUE;
	    
	    int totalsubarrays = (int) (1L * n*(n+1)/2);
	    
	    int count = 0;
	    while (j < n) {
	    	sum += arr[j];
	            while (sum > k && i <= j) {
	            	sum -= arr[i];
	                 i++;
	            }
	            
	             count += j - i + 1;
	            j++;
	       
	    }
	   
	    System.out.println(count);
    }
}
