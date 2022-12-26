package subarray;

public class Length_of_Longest_Subarray {
	//Given an array A[] of size N, return length of the longest subarray of non- negative integers.
	public static void main(String[] args) {
		
	   int[] arr = {2, 3, 4, -1, -2, 1, 5, 6, 3};
	   int n = arr.length;
	   
	   int i = 0, j = 0, maxLen = 0;
	   
	   while(j < n) {
		   
		   if(arr[j] >= 0) {
			   i = j;
		   }
		   while(arr[j] >= 0 ) {
			   
			   maxLen = Math.max(maxLen, j - i + 1);
			   j++;
			   
			   if(j == n) {
				   break;
			   }
		   }
		   
		   j++;
	   }
	   
	   System.out.println((long)maxLen);

	}
	
	// Another Solution
	
		static int longestSubarry( int arr[],int n) {
			   int count=0,res=0;
			   for(int i=0;i<n;i++)
			   {
			       if(arr[i]>0)
			       {
			           count++;
			       }
			       else {
			           count=0;
			       }
			       res= Math.max(res,count);
			   }
			   return res;
			   
			}

}
