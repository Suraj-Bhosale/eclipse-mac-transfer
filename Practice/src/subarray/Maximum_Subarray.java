package subarray;

public class Maximum_Subarray {

	public static void main(String[] args) {
		int[] arr = {5,4,-1,7,8};
		System.out.print(maxSubArray(arr));

	}
	
    public static int maxSubArray(int[] nums) {
        int i = 0, sum = 0, maxSum = Integer.MIN_VALUE;
        int n = nums.length;

        
        for (int k = 0; k < nums.length; k++) {
        	sum += nums[k];
			if(sum > maxSum) {
				maxSum = sum;
			}
			
			if(sum < 0) {
				sum = 0;
			}
			
		}
        
        return maxSum;
    }

}
