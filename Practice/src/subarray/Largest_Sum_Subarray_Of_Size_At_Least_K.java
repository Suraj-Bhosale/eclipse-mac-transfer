package subarray;

public class Largest_Sum_Subarray_Of_Size_At_Least_K {
	
//	Given an array and a number k, find the largest sum of the
//	subarray containing at least k numbers. It may be assumed that
//	the size of array is at-least k.
	
	public static void main(String[] args) {
	
		int[] arr = {1,1,1,1,1,1};
		int k = 2;
		
		
//		Test Cases Passed: 
//			10053 /10075
//			Time Limit Exceeded
		int n = arr.length, i = 0, j = 0, sum = 0, maxSum = Integer.MIN_VALUE;
		
		
		while(k <= n) {
			
			for(j = 0; j < n; j++) {
		
				sum += arr[j];
				
				if(j-i + 1 == k) {
					maxSum = Math.max(maxSum, sum);
					sum -= arr[i];
					i++;
					
				}
			}
			k++;
			i = 0;
			sum = 0;
		}
		
		System.out.println(maxSum);

	}

}
