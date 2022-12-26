package subarray;

public class Sum_Of_Subarrays {

	public static void main(String[] args) {
		long[] arr = {1,2,3,4};
		long n = arr.length;
	
		
		System.out.println(subarraySum(arr,n));

	}
	
    public static long subarraySum( long a[], long n) {
        long result =0;
		for (int i = 0; i < n; i++) 
		 result+= (a[i] * (i+1) * (n-i))%1000000007;
		 return result;  
      }

}
