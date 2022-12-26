package two_pointers;

import java.util.HashMap;

public class longest_sum_array_with_sumk {
	static int k = 15;
	public static void main(String[] args) {
		
		int[] arr ={1,2,3,4,5};
		int n = arr.length;
	    int m = 9;
		//printAllSub(n,arr);
		int ans = lenOfLongSubarr(arr,n,m);
		System.out.println(ans);
		
		//System.out.println(maxLen(arr,n));
		
		//System.out.println(printAllSub(n,arr));
	}
	
	public static void printAllSub(int n, int[] arr){
		int ans = 0;
		for(int i = 0; i < n; i++) {

			for(int j = i; j < n; j++) {
				 ans = printSub(arr,i,j);
				
			}
		}
		System.out.println("Count is:"+ ans);
	}

    static int max = 0;
	public static int printSub(int[] arr, int s, int e) {
		int sum = 0;
	
		int i = 0,j = 0;
		for( i = s; i <= e; i++) {
	
			sum+= arr[i];
			j++;
			
		}
		
		if(sum == k) {
			
			int temp = j;
			max = Math.max(max,temp);
		
		}
		
		
		return max;
	}
	
	public static int lenOfLongSubarr(int A[], int N, int K)
	{
	 
	    int i = 0, j = 0, sum = 0;
	    int maxLen = Integer.MIN_VALUE;
	   
	    while (j < N) {
	        sum += A[j];
	        if (sum < K) {
	            j++;
	        }
	        else if (sum == K) {
	            maxLen = Math.max(maxLen, j-i+1);
	            j++;
	        }
	        else if (sum > K) {
	            while (sum > K) {
	                sum -= A[i];
	                 i++;
	            }
	            j++;
	        }
	    }
	    return maxLen;
	}
	
	   static int maxLen(int arr[], int n)
	   {
	       // Your code here
	       HashMap<Integer,Integer>map=new HashMap<>();
	       
	       int sum=0;
	       map.put(0,-1);
	       int len=0;
	       for(int i=0;i<n;i++){
	           
	           sum=sum+arr[i];
	           if(map.containsKey(sum)){
	              int temp_len = i-map.get(sum);
	              if(len < temp_len){
	                  len = temp_len;
	              }
	           }else{
	               map.put(sum,i);
	              }
	       }
	       return len;
	   }

}
