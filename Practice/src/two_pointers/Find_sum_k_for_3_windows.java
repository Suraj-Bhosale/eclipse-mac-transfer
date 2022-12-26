package two_pointers;

public class Find_sum_k_for_3_windows {

	public static void main(String[] args) {
	     int[] A = {1,2,3,4,5,1,1,1,1,1};
	     int n = A.length;
	     int win = 3;
	     int K = 3;
	     int s = 0, e = 0,sum = 0, maxSum = Integer.MIN_VALUE;
	     
		for(e = 0; e < n; e++) {
			
		    sum += A[e];
		    
		    if(e-s == win-1) {
		    //	maxSum = Math.max(sum, maxSum);
		    	if(sum == K) {
		    		System.out.println("Got :" + e + " and "+ s);
		    		break;
		    	}
		    	sum -= A[s];
		    	s++;
		    	//e++;
		    }
			
			
			
		}

	}

}
