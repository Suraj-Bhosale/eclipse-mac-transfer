package arrays;

public class Count_Nice_Subarray {
	static int k = 1;
	public static void main(String[] args) {
		int[] arr = {2,2,2,1,2,2,1,2,2,2};
		int n = arr.length;
		for(int i = 0; i < n; i++) {
		  arr[i] = arr[i]%2;
		}
		int m = 2;
		//printAllSub(n,arr);
		System.out.println(lenOfLongSubarr(arr,n,m));
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

    static int count = 0;
	public static int printSub(int[] arr, int s, int e) {
		int sum = 0;
		for(int i = s; i <= e; i++) {
			//System.out.print(arr[i]);
			//System.out.print("*");
			sum+= arr[i];
		}
		
		if(sum == k) {
			count++;
		}
		
		//System.out.println();
		return count;
	}
	
	public static int lenOfLongSubarr(int arr[], int N, int K)
	{
	 
	    int i = 0, j = 0, sum = 0;
	    int maxLen = Integer.MIN_VALUE;
	   
	    while (j < N) {
	        sum += arr[j];
	        if (sum < K) {
	            j++;
	        }
	        else if (sum == K) {
	           // maxLen = Math.max(maxLen, j-i+1);
	        	count++;
	            j++;
	        }
	        else if (sum > K) {
	            while (sum > K) {
	                sum -= arr[i];
	                 i++;
	            }
	            j++;
	        }
	    }
	    return count;
	}

}
