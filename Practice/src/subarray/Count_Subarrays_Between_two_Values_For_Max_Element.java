package subarray;

public class Count_Subarrays_Between_two_Values_For_Max_Element {

	public static void main(String[] args) {
		int[] arr = {4,3,2,3};
		int l = 1, r = 2, sum = 0, i = 0, j =0,count = 0;
		int n = arr.length;
		

		 System.out.print(countSubarray(arr,n,r)-countSubarray(arr,n,l-1));
	}
	
	
    static long countSubarray(int arr[], int n, int k)
    {
 
        int s = 0;
 
        // Traversing the array.
        int i = 0;
        while (i < n) {
 
            // If element is greater than k, ignore.
            if (arr[i] > k) {
                i++;
                continue;
            }
 
            // Counting the subarray length whose
            // each element is less than equal to k.
            int count = 0;
            while (i < n && arr[i] <= k) {
                i++;
                count++;
            }
 
            // Summing number of subarray whose
            // maximum element is less than equal to k.
            s += ((count * (count + 1)) / 2);
        }
 
        return (long)s;
    }


}
