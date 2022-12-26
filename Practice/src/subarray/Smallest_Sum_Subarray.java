package subarray;

public class Smallest_Sum_Subarray {

	
	public static void main(String[] args) {
		int[] arr = {3,-4, 2,-3,-1, 7,-5};
		System.out.print(maxSubArray(arr));

	}
	
    public static int maxSubArray(int[] nums) {
        int i = 0, sum = 0, minSum = Integer.MAX_VALUE;
        int n = nums.length;

        
        for (int k = 0; k < nums.length; k++) {
        	sum += nums[k];
			if(sum > nums[k]) {
				sum = nums[k];
			}
			
			minSum = Math.min(minSum, sum);

			
		}
        
        return minSum;
    }
}
