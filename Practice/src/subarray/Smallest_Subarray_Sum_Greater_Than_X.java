package subarray;

import java.util.HashMap;

public class Smallest_Subarray_Sum_Greater_Than_X {

	public static void main(String[] args) {
		
		int[] A = {15, 20, 43, 24, 63, 5, 85, 70};
		int n = A.length;
		int x  =  368 ;
		
		longSubarrWthSumDivByKPart2(A,n,x);
	}
	
    static void longSubarrWthSumDivByK(int a[], int n, int k)
    {
	    int i = 0, j = 0, sum = 0;
	    int minLen = Integer.MAX_VALUE;
	    int count = 0;
	    while (j < n) {
	        sum += a[j];
	        if (sum < k) {
	            j++;
	        }
	        else if (sum == k) {
	            
	            j++;
	        }
	        else if (sum > k) {
	        	
	            while (sum > k) {
	            	minLen = Math.min(minLen, j-i+1);
	         
	                sum -= a[i];
	                 i++;
	            }
	            j++;
	        }
	    }
	    System.out.println(minLen);
    }
    
    static void longSubarrWthSumDivByKPart2(int a[], int n, int k)
  {
	    int i = 0, j = 0, sum = 0;
	    int minLen = Integer.MAX_VALUE;
	    int count = 0;
	    while (j < n) {
	        sum += a[j];
	        if (sum < k) {
	            j++;
	        }
	        else if (sum == k) {
	            
	            j++;
	        }
	        else if (sum > k && i <= j) {
	        	
	            while (sum > k && i <= j) {
	            	count++;
	            	minLen = Math.min(minLen, j-i+1);
	                
	                sum -= a[i];
	                 i++;
	            }
	            j++;
	        }
	    }
	    
	    if(count == 0) {
	    	minLen = 0;
	    }
	    System.out.println(minLen);
  }

}
