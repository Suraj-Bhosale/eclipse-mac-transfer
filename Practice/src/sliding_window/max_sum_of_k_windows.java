package sliding_window;

public class max_sum_of_k_windows {
	public static void main(String[] args) {
	     int[] A = {1,3,-1,-3,5,3,6,7};
	     int n = A.length;
	     int win = 3;
	     int K = 3;
	     int s = 0, e = 0,sum = 0, maxSum = Integer.MAX_VALUE;
	     
		for(e = 0; e < n; e++) {
			
		    sum += A[e];
		    
		    if(e-s+1 == win) {
		    	maxSum = Math.min(sum, maxSum);
		 
		    	sum -= A[s];
		    	s++;
		    	
		    }
			
			
			
		}
		
		System.out.println(maxSum);

	}
}
