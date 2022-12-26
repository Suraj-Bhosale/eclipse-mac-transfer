package subarray;

public class Maximum_Sum_of_Subarray_less_than_or_Equal_to_x {

//	Given an array arr[] of integers of size N and a number X,
//	the task is to find the sum of subarray having maximum sum
//	less than or equal to the given value of X.
	
	public static void main(String[] args) {
		
				long[] arr = {1, 2, 3, 4, 5} ;
				int N = arr.length, X = 11;
				
				System.out.println(findMaxSubarraySum(arr,N,X));
	}
	
     static long findMaxSubarraySum(long arr[], int N,int X)
    {
       int i = 0, j = 0, sum = 0, maxSum = Integer.MIN_VALUE;
       
       while(j < N){
           sum += arr[j];
           if(sum <= X) {
        	   maxSum = Math.max(maxSum, sum);
        	   j++;
           }
           
           else if(sum > X ) {
	           while(sum > X ){
	               sum -= arr[i];
	               i++;
	           }
	          if(sum <= X) {
        	   maxSum = Math.max(maxSum, sum);
        	  
           }
              j++;
           }
       }
       return maxSum;
    }

}
